/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import com.dbutil.DBsingletone;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Spoorthi
 */
@WebServlet(name = "User_Reg", urlPatterns = {"/User_Reg"})
public class User_Reg extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String name = request.getParameter("name");
            String mail = request.getParameter("email");
            String add = request.getParameter("add");
            String num = request.getParameter("pho");
            String dname = request.getParameter("dname");
            String dheight = request.getParameter("dheight");
            String dlength = request.getParameter("dlength");
            String ddate = request.getParameter("ddate");
            String pass = request.getParameter("pass");
            String place = request.getParameter("dplace");
            String stateid = request.getParameter("state1");

            DBsingletone db = new DBsingletone();
            java.sql.Connection c = db.getConnection();

            System.out.println("DB Conected");

            PreparedStatement ps = c.prepareStatement("select * from `users`  where umail='" + mail + "' AND upho='" + num + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                out.print("<script>alert(\"User Already Exist\");window.location.href=\"User_Register.jsp\";</script>");

            } else {
                PreparedStatement ps1 = c.prepareStatement("insert into `users`(uname,umail,uadd,upho,upass) values('" + name + "','" + mail + "','" + add + "','" + num + "','" + pass + "')");
                int i = ps1.executeUpdate();
                if (i == 1) {
                    PreparedStatement p = c.prepareStatement("SELECT MAX(uid) AS uid FROM `users`");
                    ResultSet r = p.executeQuery();
                    if (r.next()) {
                        PreparedStatement ps2 = c.prepareStatement("insert into `dam`(dname,place,uid,d_height,d_lenght,c_date,state) values('" + dname + "','" + place + "','" + r.getString("uid") + "','" + dheight + "','" + dlength + "','" + ddate + "','"+stateid+"')");
                        int j = ps2.executeUpdate();
                        if (j > 0) {
                            out.print("<script>alert(\"Register successfully\"); window.location.href=\"UserLogin.jsp\";</script>");
                        }
                    }

                }
            }
        } catch (Exception e) {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

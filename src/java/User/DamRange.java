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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Spoorthi
 */
@WebServlet(name = "DamRange", urlPatterns = {"/DamRange"})
public class DamRange extends HttpServlet {

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
        HttpSession session = request.getSession();
        try (PrintWriter out = response.getWriter()) {
            DBsingletone db = new DBsingletone();
            java.sql.Connection c = db.getConnection();
            String maxin = request.getParameter("maxin");
            String maxout = request.getParameter("maxout");
            String uid = session.getAttribute("uid").toString();
            String did = "";
            PreparedStatement ps2 = c.prepareStatement("select * from `dam`  where uid='" + uid + "'");
            ResultSet rs2 = ps2.executeQuery();
            if (rs2.next()) {
                did = rs2.getString("did");
            }

            PreparedStatement ps = c.prepareStatement("select * from `range`  where did='" + did + "'");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                PreparedStatement ps1 = c.prepareStatement("update `range` set maxinflow='" + maxin + "',maxoutflow='" + maxout + "' where did='" + did + "'");
                int i = ps1.executeUpdate();
                if (i == 1) {
                    out.print("<script>alert(\"Added Sucessfull\");window.location.href=\"User/SetRange.jsp\";</script>");
                }

            } else {
                PreparedStatement ps1 = c.prepareStatement("insert into `range`(maxinflow,maxoutflow,did) values('" + maxin + "','" + maxout + "','" + did + "')");
                int i = ps1.executeUpdate();
                if (i == 1) {
                    out.print("<script>alert(\"Added Sucessfull\");window.location.href=\"User/SetRange.jsp\";</script>");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
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

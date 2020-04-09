/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

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
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Spoorthi
 */
@WebServlet(name = "DamDetailsByDate", urlPatterns = {"/DamDetailsByDate"})
public class DamDetailsByDate extends HttpServlet {

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
            DBsingletone db = new DBsingletone();
            java.sql.Connection c = db.getConnection();

            String date = request.getParameter("date");

            JSONArray array = new JSONArray();

            PreparedStatement ps = c.prepareStatement("SELECT w.did,w.wid,w.date,d.`dname`,w.`inflow`,w.`outflow`,r.`maxinflow`,r.`maxoutflow` FROM `water_level` w INNER JOIN `dam` d ON d.`did` =w.did INNER JOIN `users` u ON u.`uid`=d.`uid` INNER JOIN `range` r ON r.`did`=w.did WHERE DATE(w.`date`)='" + date + "'");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String[] maxinflow = rs.getString("maxinflow").split(" ");
                String[] maxoutflow = rs.getString("maxoutflow").split(" ");
                String[] inflow = rs.getString("inflow").split(" ");
                String[] outflow = rs.getString("outflow").split(" ");
                JSONObject obj = new JSONObject();
                obj.put("wid", rs.getString("wid"));
                obj.put("date", rs.getString("date"));
                obj.put("dname", rs.getString("dname"));
                obj.put("inflow", rs.getString("inflow"));
                obj.put("outflow", rs.getString("outflow"));
                obj.put("max_inflow", rs.getString("maxinflow"));
                obj.put("max_outflow", rs.getString("maxoutflow"));
                obj.put("did", rs.getString("did"));
                obj.put("one", inflow[0]);
                obj.put("two", outflow[0]);
                obj.put("one_one", maxinflow[0]);
                obj.put("two_two", maxoutflow[0]);
                array.put(obj);
                System.out.println(obj);
            }
            out.print(array);
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

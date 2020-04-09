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
@WebServlet(name = "GetState", urlPatterns = {"/GetState"})
public class GetState extends HttpServlet {

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

            String meth = request.getParameter("meth");

            if (meth.equals("getstate")) {
                PreparedStatement stmt = c.prepareStatement("SELECT * from state");
                ResultSet rs = stmt.executeQuery();
                JSONArray Json = new JSONArray();

                while (rs.next()) {

                    JSONObject obj = new JSONObject();

                    obj.put("sid", rs.getString("state_id"));
                    obj.put("state", rs.getString("state"));
                    Json.put(obj);
                }

                out.print(Json);
            } else {
                String sid=request.getParameter("bid");
                PreparedStatement stmt = c.prepareStatement("SELECT * from city where state='"+sid+"' ");
                ResultSet rs = stmt.executeQuery();
                JSONArray Json = new JSONArray();

                while (rs.next()) {

                    JSONObject obj = new JSONObject();

                    obj.put("cid", rs.getString("cid"));
                    obj.put("city", rs.getString("city_name"));
                    Json.put(obj);
                }

                out.print(Json);
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

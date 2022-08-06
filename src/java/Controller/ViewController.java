/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sql.SqlDb;

/**
 *
 * @author User
 */
@WebServlet(name = "ViewController", urlPatterns = {"/ViewController"})
public class ViewController extends HttpServlet {

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

        RequestDispatcher rd = null;
        
        SqlDb db = new SqlDb();
        String set = request.getParameter("set");
        String name = request.getParameter("name");
        request.setAttribute("name", name);


        if ("home".equals(set)) {
            if (name == null) {
                rd = request.getRequestDispatcher("searchDetailHome.jsp");
            } else {
                request.setAttribute("list", db.查詢Home(name));
                request.setAttribute("book", "Home");
                rd = request.getRequestDispatcher("searchView.jsp");
            }
        } else if ("school".equals(set)) {
            if (name == null) {
                rd = request.getRequestDispatcher("searchDetailSchool.jsp");
            } else {
                request.setAttribute("book", "School");
                request.setAttribute("list", db.查詢School(name));
                rd = request.getRequestDispatcher("searchView.jsp");
            }
        } else if ("company".equals(set)) {
            if (name == null) {
                rd = request.getRequestDispatcher("searchDetailCompany.jsp");
            } else {
                request.setAttribute("book", "Company");
                request.setAttribute("list", db.查詢Company(name));
                rd = request.getRequestDispatcher("searchView.jsp");
            }

        }

        rd.forward(request, response);

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

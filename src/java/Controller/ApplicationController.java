/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.記帳資料;
import Model.記帳資料庫;
import sql.SqlDb;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
@WebServlet(name = "ApplicationController", urlPatterns = {"/ApplicationController"})
public class ApplicationController extends HttpServlet {

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
        
     
        response.setContentType("text/html,charset=utf-8");

        RequestDispatcher rd = null;

        SqlDb db = new SqlDb();
        記帳資料 user = new 記帳資料();

        String name = request.getParameter("name");
        String set = request.getParameter("set");
        String product = request.getParameter("product");
        String priceString = request.getParameter("price");
        String numberString = request.getParameter("number");
        int price = 0;
        int number = 0;
       
        try {
            price = Integer.parseInt(priceString);
            number = Integer.parseInt(numberString);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
      
        user.setName(name);
        user.setProduct(product);
        user.setPrice(price);
        user.setNumber(number);
        user.setTotal(price * number);

        if ("home".equals(set)) {
            db.新增Home(name, product, price, number, price * number);
            request.setAttribute("book", "Home");
        } else if ("school".equals(set)) {
            db.新增School(name, product, price, number, price * number);
            request.setAttribute("book", "School");
        } else if ("company".equals(set)) {
            db.新增Company(name, product, price, number, price * number);
            request.setAttribute("book", "Company");
        }

        request.setAttribute("user", user);

        

        rd = request.getRequestDispatcher("newView.jsp");
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

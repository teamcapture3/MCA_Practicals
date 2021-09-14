/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SessionBean;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ninad
 */
public class calcservlet extends HttpServlet {
    @EJB
    calcbean c;
    double l;

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
            double a = Double.parseDouble(request.getParameter("number1"));
            double b = Double.parseDouble(request.getParameter("number2"));
            String m = request.getParameter("operation");
            c.setA(a);
            c.setB(b);
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet calcservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            if (m.equals("addition")) {
                c.addition();
                l = c.getS();
                out.println("Addition of " + a + " and " + b + " is: " + l);
            } else if (m.equals("subtraction")) {
                c.subtraction();
                l = c.getS();
                out.println("Subtraction of " + a + " and " + b + " is: " + l);
            } else if (m.equals("multiplication")) {
                c.multiplication();
                l = c.getS();
                out.println("Multiplication of " + a + " and "  + b + " is: " + l);
            } else if (m.equals("division")) {
                c.division();
                l = c.getS();
                out.println("Division of " + a + " and " + b + " is: " + l);
            } else if (m.equals("modulo")) {
                c.modulo();
                l = c.getS();
                out.println("Modulo of " + a + " and " + b + " is: " + l);
            }
            out.println("</body>");
            out.println("</html>");
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

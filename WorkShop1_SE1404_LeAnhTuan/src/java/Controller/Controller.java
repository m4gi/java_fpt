/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CourseDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Le Anh Tuan
 */
public class Controller extends HttpServlet {

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
            throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProductController</title>");
            out.println("</head>");
            out.println("<body>");
            String id = request.getParameter("courseID");
            String subject = request.getParameter("subject");
            String lecturer = request.getParameter("lecturer");
            String schedule = request.getParameter("schedule");
            if (Validation(id, subject, lecturer, schedule).equals("")) {
                if (CourseDB.Insert(id, subject, lecturer, schedule)) {
                    System.out.println("ok");
                    
                    out.println("<h1>Insert Successful! " + "</h1>");
                }

            } else {
                System.out.println("not ok");
                out.println("<h1>Fail! " + "</h1>");
                out.println(Validation(id, subject, lecturer, schedule));
            }
            out.println("<form action = \"index.jsp\">");
            out.println("<br><br>");
            out.println("<input type=\"submit\" value=\"Back\">");
            out.println("</form>");
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    public String Validation(String id, String subject, String lecturer, String schedule) throws Exception {
        if (id.matches("") || id.equals("")) {
            return "Course ID must follow digits";
        }
        if (subject.matches("") || subject.equals("")) {
            return "Course subject isn't NULL";
        }
        if (lecturer.matches("") || lecturer.equals("")) {
            return "Course lecturer isn't NULL";
        }
        if (schedule.matches("") || schedule.equals("")) {
            return "Course schedule isn't NULL";
        }
        return "";
    }
}

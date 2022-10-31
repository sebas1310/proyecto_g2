package com.example.webappseguridad.Servelts;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "VerIncidencia", urlPatterns = {"/VerIncidencia"})
public class VerIncidencia extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            RequestDispatcher vista = request.getRequestDispatcher("VerIncidencia.jsp");
            vista.forward(request, response);
        }catch(ServletException e){

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

package br.com.ada.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cadastro")
public class Cadastro extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String document = req.getParameter("document");
        String celNumber = req.getParameter("cel-number");
        String address = req.getParameter("address");

        if(name.equals("") || document.equals("") || celNumber.equals("") || address.equals("")){
            resp.setContentType("text/html");
            resp.getWriter().println("<h3>Dados obrigatórios não preenchidos!</h3>");
            resp.getWriter().println("<a href='index.jsp'>Tentar novamente</a>");

        }else {
            req.setAttribute("name",name);
            req.setAttribute("document",document);
            req.setAttribute("cel-number",celNumber);
            req.setAttribute("address",address);

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("data.jsp");

            requestDispatcher.forward(req,resp);
        }
    }
}

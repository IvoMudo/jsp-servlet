package br.com.ada.servlet;

import br.com.ada.controller.DataFetch;
import br.com.ada.model.Address;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
@WebServlet("/consultaCep")
public class ConsultaCep extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String addressCEP = req.getParameter("addressCEP");
        String estado = req.getParameter("estado");
        String cidade = req.getParameter("cidade");

        req.setAttribute("addressCEP",addressCEP);
        req.setAttribute("estado",estado);
        req.setAttribute("cidade",cidade);
    }

    public Address consulta(String cep){
        String baseUrl = "https://brasilapi.com.br/api/cep/v1/%s".formatted(cep);
        Address address = DataFetch.fetchFromUrl(baseUrl, Address.class);
        return address;
    }
}

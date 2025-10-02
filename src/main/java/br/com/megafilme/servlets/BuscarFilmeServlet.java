package br.com.megafilme.servlets;

import br.com.megafilme.conexao.Conecta;
import br.com.megafilme.dao.FilmeDAO;
import br.com.megafilme.objeto.Filmes;
import com.google.gson.Gson;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/buscarFilme")
public class BuscarFilmeServlet extends HttpServlet {

       private final Gson gson = new Gson();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String idParam = req.getParameter("id");

        if (idParam == null || idParam.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.getWriter().write("{\"error\":\"ID é obrigatório\"}");
            return;
        }

        try {
            Integer id = Integer.parseInt(idParam);

            Filmes filme = new FilmeDAO().ListaFilmeID(id);

            if (filme == null) {
                resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
                resp.getWriter().write("{\"error\":\"Filme não encontrado\"}");
                return;
            }
            req.setAttribute("strFilme", filme);
            req.getRequestDispatcher("/alugaTeste.jsp").forward(req, resp);

        } catch (NumberFormatException | ServletException e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.getWriter().write("{\"error\":\"ID inválido\"}");
        }
    }

}

package br.com.megafilme.servlets;

import br.com.megafilme.dao.FilmeDAO;
import br.com.megafilme.objeto.Filmes;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ListaFilme")
public class ListaFilmesServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private FilmeDAO dao = new FilmeDAO();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Filmes> lista = dao.ListaFilmes();
        req.setAttribute("Filmes",lista);
        req.getRequestDispatcher("ListaFilme.jsp").forward(req,resp);
    }
}

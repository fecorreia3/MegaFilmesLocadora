/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.com.megafilme.servlets;

import br.com.megafilme.dao.GeneroDAO;
import br.com.megafilme.objeto.Genero;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fe_li
 */
@WebServlet(name = "GeneroServlet", urlPatterns = {"/GeneroServlet"})
public class GeneroServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        Genero genero = new Genero();
        genero.setNome_genero(req.getParameter("genero_nome"));
        
        
        GeneroDAO dao = new GeneroDAO();
        dao.salva(genero);
        
        PrintWriter out = resp.getWriter();
        out.println("Novo Genero Salvo!!!");
       
        
    }
    
    
    
}

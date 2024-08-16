/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.megafilme.metodo;

import br.com.megafilme.dao.GeneroDAO;
import static br.com.megafilme.logger.Logger.gravarLog;
import br.com.megafilme.objeto.Genero;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fe_li
 *
 * @
 */
public class gravaGenero {

    public static void main(String[] args) throws IOException {
        try {
            List<String> generos = new ArrayList();
            generos.add("Ação");
            generos.add("Animação");
            generos.add("Aventura");
            generos.add("Biografia");
            generos.add("Chanchada");
            generos.add("Cinema de arte");
            generos.add("Comédia");
            generos.add("Comédia de ação");
            generos.add("Comédia de terror");
            generos.add("Comédia dramática");
            generos.add("Comédia romântica");
            generos.add("Dança");
            generos.add("Docuficção");
            generos.add("Documentário");
            generos.add("Drama");
            generos.add("Erôtico");
            generos.add("Espionagem");
            generos.add("Fantasia");
            generos.add("Fantasia científica");
            generos.add("Faroeste");
            generos.add("Ficção científica");
            generos.add("Filme policial");
            generos.add("Filmes com truques");
            generos.add("Filmes de guerra");
            generos.add("Guerra");
            generos.add("Infantil");
            generos.add("Mistério");
            generos.add("Musical");
            generos.add("Porno");
            generos.add("Religioso");
            generos.add("Romance");
            generos.add("Suspense");
            generos.add("Terror");
            generos.add("Thriller");
            for (String g : generos) {
                gravaGenero grava = new gravaGenero(null, g);
            }

        } catch (IOException e) {
            gravarLog(e.getMessage(), 1);
        }
    }

    public gravaGenero(Integer id, String genero) throws IOException {
        Genero g = new Genero();
        g.setId_genero(id);
        g.setNome_genero(genero);

        try {
            GeneroDAO dao = new GeneroDAO();
            dao.salva(g);
        } catch (IOException e) {
            gravarLog(e.getMessage(), 1);
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.megafilme.metodo;

import br.com.megafilme.conexao.Conecta;
import br.com.megafilme.dao.GeneroDAO;
import static br.com.megafilme.logger.Logger.gravarLog;
import br.com.megafilme.objeto.Genero;

import javax.persistence.EntityManager;
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
        gravaGenero g = new gravaGenero();
        g.populaGenero();


    }

    public void grava(Integer id, String genero) throws IOException {
        Genero g = new Genero();
        g.setId_genero(id);
        g.setGenero_nome(genero);

        try {
            GeneroDAO dao = new GeneroDAO();
            dao.salva(g);
        } catch (IOException e) {
            gravarLog(e.getMessage(), 1);
        }
    }


    public void populaGenero(){
        EntityManager em = new Conecta().getConnection();
        Genero ge1 = new Genero(1, "Ação");
        Genero ge2 = new Genero(2, "Animação");
        Genero ge3 = new Genero(3, "Aventura");
        Genero ge4 = new Genero(4, "Biografia");
        Genero ge5 = new Genero(5, "Chanchada");
        Genero ge6 = new Genero(6, "Cinema de arte");
        Genero ge7 = new Genero(7, "Comédia");
        Genero ge8 = new Genero(8, "Comédia de ação");
        Genero ge9 = new Genero(9, "Comédia de terror");
        Genero ge10 = new Genero(10, "Comédia dramática");
        Genero ge11 = new Genero(11, "Comédia romântica");
        Genero ge12 = new Genero(12, "Dança");
        Genero ge13 = new Genero(13, "Docuficção");
        Genero ge14 = new Genero(14, "Documentário");
        Genero ge15 = new Genero(15, "Drama");
        Genero ge16 = new Genero(16, "Erôtico");
        Genero ge17 = new Genero(17, "Espionagem");
        Genero ge18 = new Genero(18, "Fantasia");
        Genero ge19 = new Genero(19, "Fantasia científica");
        Genero ge20 = new Genero(20, "Faroeste");
        Genero ge21 = new Genero(21, "Ficção científica");
        Genero ge22 = new Genero(22, "Filme policial");
        Genero ge23 = new Genero(23, "Filmes com truques");
        Genero ge24 = new Genero(24, "Filmes de guerra");
        Genero ge25 = new Genero(25, "Guerra");
        Genero ge26 = new Genero(26, "Infantil");
        Genero ge27 = new Genero(27, "Mistério");
        Genero ge28 = new Genero(28, "Musical");
        Genero ge29 = new Genero(29, "Porno");
        Genero ge30 = new Genero(30, "Religioso");
        Genero ge31 = new Genero(31, "Romance");
        Genero ge32 = new Genero(32, "Suspense");
        Genero ge33 = new Genero(33, "Terror");
        Genero ge34 = new Genero(34, "Thriller");

        em.getTransaction().begin();

        em.persist(ge1);
        em.persist(ge2);
        em.persist(ge3);
        em.persist(ge4);
        em.persist(ge5);
        em.persist(ge6);
        em.persist(ge7);
        em.persist(ge8);
        em.persist(ge9);
        em.persist(ge10);
        em.persist(ge11);
        em.persist(ge12);
        em.persist(ge13);
        em.persist(ge14);
        em.persist(ge15);
        em.persist(ge16);
        em.persist(ge17);
        em.persist(ge18);
        em.persist(ge19);
        em.persist(ge20);
        em.persist(ge21);
        em.persist(ge22);
        em.persist(ge23);
        em.persist(ge24);
        em.persist(ge25);
        em.persist(ge26);
        em.persist(ge27);
        em.persist(ge28);
        em.persist(ge29);
        em.persist(ge30);
        em.persist(ge31);
        em.persist(ge32);
        em.persist(ge33);
        em.persist(ge34);

        em.getTransaction().commit();

        em.close();

    }

}

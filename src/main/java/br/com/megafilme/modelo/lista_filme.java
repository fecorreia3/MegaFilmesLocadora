/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.megafilme.modelo;

import br.com.megafilme.objeto.Filmes;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author fe_li
 */

public class lista_filme {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LocadoraMegaFilmes");
        EntityManager em = emf.createEntityManager();

//        Filmes filme = new Filmes();
        Filmes filme = em.find(Filmes.class, 2);
        System.out.print(filme);

        String jpql = "SELECT filmes FROM Filmes filmes";
        Query query = em.createQuery(jpql);
        System.out.println(query.getResultList());;

    }

}

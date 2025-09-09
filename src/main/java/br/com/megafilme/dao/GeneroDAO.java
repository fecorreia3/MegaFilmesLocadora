/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.megafilme.dao;

import br.com.megafilme.conexao.Conecta;
import static br.com.megafilme.logger.Logger.gravarLog;
import br.com.megafilme.objeto.Genero;
import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author fe_li
 */
public class GeneroDAO {

    public Genero salva(Genero genero) throws IOException {
        EntityManager em = new Conecta().getConnection();

        try {
            em.getTransaction().begin();
            if (genero.getId_genero() == null) {
                em.persist(genero);
            } else {
                em.merge(genero);
            }
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            gravarLog(e.getMessage(), 1);
        }
        em.clear();
        em.close();
        return genero;
    }

    public Genero exclui(Integer id) throws IOException {
        EntityManager em = new Conecta().getConnection();
        Genero genero = null;
        
        try {
            genero = em.find(Genero.class, id);
            em.getTransaction().begin();
            em.remove(genero);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
            gravarLog(e.getMessage(), 1);
        }
        em.clear();
        em.close();
        return genero;
    }

    public Genero localizaID(Integer id) throws IOException {
        EntityManager em = new Conecta().getConnection();
        Genero genero = null;
        try {
            genero = em.find(Genero.class, id);
        } catch (Exception e) {
            gravarLog(e.getMessage(), 1);
        }
        em.clear();
        em.close();
        return genero;
    }

    public List<Genero> ListaGeral() throws IOException {
        EntityManager em = new Conecta().getConnection();

            List<Genero> listaG = null;

            try{
                listaG = em.createQuery("from Genero g").getResultList();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        em.clear();
        em.close();

        return listaG;
    }

}

package br.com.megafilme.dao;

import br.com.megafilme.conexao.Conecta;
import br.com.megafilme.objeto.Filmes;

import java.util.List;
import javax.persistence.EntityManager;

public class FilmeDAO {

    public List<Filmes> ListaFilmes(){
        EntityManager em = new Conecta().getConnection();
        List<Filmes> lista =null;
        try{
            lista = em.createQuery("from Filmes f").getResultList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            em.close();
        }
        return lista;
    }

    public Filmes ListaFilmeID(Integer id){
        EntityManager em = new Conecta().getConnection();
        try{
            return em.find(Filmes.class, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            em.close();
        }
    }



}

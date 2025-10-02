package br.com.megafilme.dao;

import br.com.megafilme.conexao.Conecta;
import br.com.megafilme.objeto.Cliente;

import javax.persistence.EntityManager;

public class ClienteDAO {

    public void salva(Cliente cliente){
        EntityManager em = new Conecta().getConnection();

        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }finally {
            em.close();
        }
    }


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.megafilme.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author fe_li
 */
public class Conecta {
     private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LocadoraMegaFilmes");
    
    public EntityManager getConnection(){
        
        return emf.createEntityManager();
    }
}

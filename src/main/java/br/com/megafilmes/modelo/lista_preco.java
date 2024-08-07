/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.megafilmes.modelo;

import br.com.megafilmes.objeto.Preco;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author fe_li
 */
public class lista_preco {
    
    
    public static void main(String[] args){
             EntityManagerFactory emf = Persistence.createEntityManagerFactory("LocadoraMegaFilmes");
        EntityManager em = emf.createEntityManager();
    
        List<Preco> lista_preco = null;
        
        try{
            lista_preco = em.createQuery("from preco").getResultList();
            
        }catch(Exception e){
            
        }
        
        for(Preco p: lista_preco){
           System.out.print("id: "+ p.getId_preco());
           System.out.print("tipo: "+p.getNome());
           System.out.println("valor: "+p.getValor());
           
            
        }
        
        
        
    }
                
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.megafilmes.modelo;

import br.com.megafilmes.objeto.Filmes;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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

        List<Filmes> listaFilmes = null;
        
        try{
            listaFilmes = em.createQuery("from Filmes").getResultList();
            
        }catch(Exception e){
            
        }
        em.close();
        
        
        for(Filmes f: listaFilmes){
            System.out.println("ID - Titulo - Genero - Data da Compra - tipo");
            System.out.print(f.getId());
            System.out.print(f.getTitulo());
            System.out.print(f.getGenero().getNome());
            System.out.print(f.getDt_compra());
            
        }
        
    }

}

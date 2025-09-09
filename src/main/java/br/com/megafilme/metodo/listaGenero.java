/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.megafilme.metodo;

import br.com.megafilme.dao.GeneroDAO;
import br.com.megafilme.objeto.Genero;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fe_li
 */
public class listaGenero {
    
    public static void main(String[] args){

        listaGenero l = new listaGenero();
        
    }
    

    public listaGenero() {
        
         GeneroDAO dao = new GeneroDAO();
        
        try {
            for(Genero c: dao.ListaGeral()){
                System.out.print("ID: " + c.getId_genero());
                System.out.println(" Categoria: " + c.getGenero_nome());
            }

        } catch (IOException ex) {
            Logger.getLogger(listaGenero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
}

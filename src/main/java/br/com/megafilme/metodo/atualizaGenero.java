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
public class atualizaGenero {

    public atualizaGenero(Integer id, String genero) {
        Genero g = new Genero();
        g.setId_genero(id);
        g.setGenero_nome(genero);
        
        GeneroDAO dao = new GeneroDAO();
        try {
            dao.salva(g);
        } catch (IOException ex) {
            Logger.getLogger(atualizaGenero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
}

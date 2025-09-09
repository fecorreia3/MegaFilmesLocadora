/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.megafilme.metodo;

import br.com.megafilme.dao.GeneroDAO;
import static br.com.megafilme.logger.Logger.gravarLog;
import br.com.megafilme.objeto.Genero;
import java.io.IOException;


/**
 *
 * @author fe_li
 */
public class consultaGenero {
    
    public static void main(String[] args) throws IOException{
        consultaGenero c = new consultaGenero(4);
    }

    public consultaGenero(Integer id) throws IOException {
        GeneroDAO dao = new GeneroDAO();
        try {
            Genero genero = dao.localizaID(id);
            
            System.out.print("ID: "+ genero.getId_genero());
            System.out.println(" Genero: "+ genero.getGenero_nome());
            
        } catch (IOException e) {
             gravarLog(e.getMessage(), 1);
        }
        
        
    }
    
    
    
    
}

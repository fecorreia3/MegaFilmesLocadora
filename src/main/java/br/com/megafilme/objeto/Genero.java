/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.megafilme.objeto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author fe_li
 */

@Entity
public class Genero {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_genero;
    private String genero_nome;

    public Integer getId_genero() {
        return id_genero;
    }

    public void setId_genero(Integer id_genero) {
        this.id_genero = id_genero;
    }

    public String getGenero_nome() {
        return genero_nome;
    }

    public void setGenero_nome(String genero_nome) {
        this.genero_nome = genero_nome;
    }

    public Genero(Integer id_genero, String genero_nome) {
        this.id_genero = id_genero;
        this.genero_nome = genero_nome;
    }

    public Genero(){

    }
}

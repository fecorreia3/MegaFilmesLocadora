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
    private String nome_genero;

    public Integer getId_genero() {
        return id_genero;
    }

    public void setId_genero(Integer id_genero) {
        this.id_genero = id_genero;
    }

    public String getNome_genero() {
        return nome_genero;
    }

    public void setNome_genero(String nome_genero) {
        this.nome_genero = nome_genero;
    }

}

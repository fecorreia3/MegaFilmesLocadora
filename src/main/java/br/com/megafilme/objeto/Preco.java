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
public class Preco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_preco;
    private String nome_preco;
    private Double valor_preco;

    public Integer getId_preco() {
        return id_preco;
    }

    public void setId_preco(Integer id_preco) {
        this.id_preco = id_preco;
    }

    public String getNome_preco() {
        return nome_preco;
    }

    public void setNome_preco(String nome_preco) {
        this.nome_preco = nome_preco;
    }

    public Double getValor_preco() {
        return valor_preco;
    }

    public void setValor_preco(Double valor_preco) {
        this.valor_preco = valor_preco;
    }
    
    
}

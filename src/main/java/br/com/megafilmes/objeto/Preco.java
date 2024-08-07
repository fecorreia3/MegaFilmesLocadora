/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.megafilmes.objeto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author fe_li
 */

@Entity
@Table(name="preco")
public class Preco implements Serializable {
    private static final long serialVersionUID = 1L;
    
     @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_preco;
    private String nome;
    private double valor;

    public Preco(Integer id_preco, String nome, double valor) {
        this.id_preco = id_preco;
        this.nome = nome;
        this.valor = valor;
    }

    public Integer getId_preco() {
        return id_preco;
    }

    public void setId_preco(Integer id_preco) {
        this.id_preco = id_preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Preco{" + "id_preco=" + id_preco + ", nome=" + nome + ", valor=" + valor + '}';
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.megafilme.objeto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author fe_li
 */

@Entity
public class Filme {
    
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_filme;
    private String titulo_filme;
    @ManyToOne
    private Genero genero_filme;
    private String dt_compra_filme;
    @ManyToOne
    private Preco tipo_filme;

    public Integer getId_filme() {
        return id_filme;
    }

    public void setId_filme(Integer id_filme) {
        this.id_filme = id_filme;
    }

    public String getTitulo_filme() {
        return titulo_filme;
    }

    public void setTitulo_filme(String titulo_filme) {
        this.titulo_filme = titulo_filme;
    }

    public Genero getGenero_filme() {
        return genero_filme;
    }

    public void setGenero_filme(Genero genero_filme) {
        this.genero_filme = genero_filme;
    }

    public String getDt_compra_filme() {
        return dt_compra_filme;
    }

    public void setDt_compra_filme(String dt_compra_filme) {
        this.dt_compra_filme = dt_compra_filme;
    }

    public Preco getTipo_filme() {
        return tipo_filme;
    }

    public void setTipo_filme(Preco tipo_filme) {
        this.tipo_filme = tipo_filme;
    }
    
    
}

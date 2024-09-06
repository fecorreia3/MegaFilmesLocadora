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
@Table(name="filmes")
public class Filmes implements Serializable {
    private static final long serialVersionUID = 1L;
    
     @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String genero;
    private String dt_compra;
    private String tipo;

    
    public Filmes(){
        
    }  

    public Filmes(Integer id, String titulo, String genero, String dt_compra, String tipo) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.dt_compra = dt_compra;
        this.tipo = tipo;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDt_compra() {
        return dt_compra;
    }

    public void setDt_compra(String dt_compra) {
        this.dt_compra = dt_compra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Filmes{" + "id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", dt_compra=" + dt_compra + ", tipo=" + tipo + '}';
    }
    
    
    
}

package br.com.megafilme.objeto;

public class Tipo {

    private Integer id_tipo;
    private String tipo;

    public Integer getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(Integer id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Tipo(String tipo) {
        this.tipo = tipo;
    }

    public Tipo() {
    }
}

package br.com.megafilme.metodo;

import br.com.megafilme.dao.FilmeDAO;
import br.com.megafilme.objeto.Filmes;

public class listaFilme {

    public static void main(String[] args) {
        Filmes filme = new FilmeDAO().ListaFilmeID(25);

        System.out.println(filme.getTitulo_filme());

    }


}

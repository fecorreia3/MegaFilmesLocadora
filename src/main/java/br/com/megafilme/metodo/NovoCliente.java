package br.com.megafilme.metodo;

import br.com.megafilme.conexao.Conecta;
import br.com.megafilme.dao.ClienteDAO;
import br.com.megafilme.objeto.Cliente;

import javax.persistence.EntityManager;

public class NovoCliente {

    public static void main(String[] args) {

        ClienteDAO dao =  new ClienteDAO();
        Cliente cl =new Cliente(
                "Vivian lola",
                "286024098-54",
                "Rua sapopemba, 387",
                "08569-875",
                "vila mariana",
                "São Paulo",
                "Bahia",
                "BA",
                "55-9865-8855",
                "25/06/1998",
                "vivian@email.com"
        );

        dao.salva(cl);

    }
}

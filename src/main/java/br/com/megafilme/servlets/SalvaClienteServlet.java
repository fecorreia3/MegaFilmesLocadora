package br.com.megafilme.servlets;

import br.com.megafilme.dao.ClienteDAO;
import br.com.megafilme.objeto.Cliente;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/salvarCliente")
public class SalvaClienteServlet extends HttpServlet {
private ClienteDAO dao = new ClienteDAO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String cpf = req.getParameter("cpf");
        String endereco = req.getParameter("endereco");
        String cep = req.getParameter("cep");
        String bairro = req.getParameter("bairro");
        String cidade = req.getParameter("cidade");
        String estado = req.getParameter("estado");
        String uf = req.getParameter("uf");
        String telefone = req.getParameter("telefone");
        String data_nascimento = req.getParameter("data_nascimento");
        String email = req.getParameter("email");

        Cliente cliente =  new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setEndereco(endereco);
        cliente.setCep(cep);
        cliente.setBairro(bairro);
        cliente.setCidade(cidade);
        cliente.setEstado(estado);
        cliente.setUf(uf);
        cliente.setTelefone(telefone);
        cliente.setData_nascimento(data_nascimento);
        cliente.setEmail(email);

        try{
            dao.salva(cliente);
            resp.getWriter().println("Usuário cadastrado com sucesso!");
            resp.sendRedirect("sucesso.html");
        } catch (Exception e) {
            resp.getWriter().println("Erro ao cadastrar usuário: " + e.getMessage());
        }

    }
}

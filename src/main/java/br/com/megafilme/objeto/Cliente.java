package br.com.megafilme.objeto;

import javax.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cliente;

    @Column(length = 255, nullable = false)
    private String nome;
    @Column(length = 15, nullable = false)
    private String cpf;
    @Column(length = 155, nullable = false)
    private String endereco;
    @Column(length = 11, nullable = false)
    private String cep;
    @Column(length = 90)
    private String bairro;
    @Column(length = 65)
    private String cidade;
    @Column(length = 30)
    private String estado;
    @Column(length = 3)
    private String uf;
    @Column(length = 15)
    private String telefone;
    @Column(length = 11)
    private String data_nascimento;
    private String email;

    public Cliente(){

    }

    public Cliente(String nome, String cpf, String endereco, String cep, String bairro, String cidade, String estado, String uf, String telefone, String data_nascimento, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.uf = uf;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
        this.email = email;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

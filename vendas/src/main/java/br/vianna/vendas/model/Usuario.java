package br.vianna.vendas.model;

import br.vianna.vendas.model.eNUM.ETipoUsuario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Usuario {

    private int id;
    private String nome, email, login, senha;
    private LocalDate dataNascimento;
    private LocalDateTime dataUltimoAcesso;
    protected ETipoUsuario perfil;
    private int idade;

    public Usuario(int id) {
        this.id = id;
    }

    public Usuario(String nome, String email, String login, String senha, ETipoUsuario perfil) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public ETipoUsuario getPerfil() {
        return perfil;
    }



    public Usuario() {
    }

    public int idade(){
        LocalDate hoje = LocalDate.now();
        return Period.between(dataNascimento, hoje).getYears();
    }

    public boolean isSenhaStrong(){
        return senha.length() >= 8 && (senha.contains("@") || senha.contains("#") || senha.contains("%") ||
                senha.contains("&") ) && senha.matches("[A-Z]") && senha.matches("[a-z]")
                && senha.matches("[0-9]");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDateTime getDataUltimoAcesso() {
        return dataUltimoAcesso;
    }

    public void setDataUltimoAcesso(LocalDateTime dataUltimoAcesso) {
        this.dataUltimoAcesso = dataUltimoAcesso;
    }
}

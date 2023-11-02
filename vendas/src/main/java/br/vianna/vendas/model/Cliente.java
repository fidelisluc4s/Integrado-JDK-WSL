package br.vianna.vendas.model;

import br.vianna.vendas.model.eNUM.ETipoUsuario;

import java.time.LocalDate;

public class Cliente extends Usuario {
    public Cliente(String zezin, String s, String ze, String s1, LocalDate localDate) {
        perfil = ETipoUsuario.CLIENTE;
    }

    public Cliente(String nome, String email, String login, String senha) {
        super(nome, email, login, senha, ETipoUsuario.CLIENTE);
    }
}

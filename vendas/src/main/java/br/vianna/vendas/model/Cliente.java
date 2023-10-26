package br.vianna.vendas.model;

import br.vianna.vendas.model.eNUM.ETipoUsuario;

public class Cliente extends Usuario {
    public Cliente() {
        perfil = ETipoUsuario.CLIENTE;
    }

    public Cliente(String nome, String email, String login, String senha) {
        super(nome, email, login, senha, ETipoUsuario.CLIENTE);
    }
}

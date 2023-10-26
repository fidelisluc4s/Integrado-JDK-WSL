package br.vianna.vendas.model;

public class Categoria {

    private String nome;

    private boolean temIsencao;

    public Categoria() {
    }

    public Categoria(String nome, boolean temIsencao) {
        this.nome = nome;
        this.temIsencao = temIsencao;
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTemIsencao() {
        return temIsencao;
    }

    public void setTemIsencao(boolean temIsencao) {
        this.temIsencao = temIsencao;
    }


}

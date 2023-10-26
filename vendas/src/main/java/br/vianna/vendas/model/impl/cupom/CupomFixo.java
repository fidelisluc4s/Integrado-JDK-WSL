package br.vianna.vendas.model.impl.cupom;

import br.vianna.vendas.model.faces.ICupom;

public class CupomFixo implements ICupom {

    private double valor;

    public CupomFixo() {
    }

    public CupomFixo(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double desconto(double total) {
        return (valor < total)?valor:0;
    }
}

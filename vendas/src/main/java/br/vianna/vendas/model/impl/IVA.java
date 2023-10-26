package br.vianna.vendas.model.impl;

import br.vianna.vendas.model.faces.IImposto;

public class IVA implements IImposto {
    public IVA() {
    }

    @Override
    public double valorImposto(double preco) {
        return preco * 0.005;
    }
}

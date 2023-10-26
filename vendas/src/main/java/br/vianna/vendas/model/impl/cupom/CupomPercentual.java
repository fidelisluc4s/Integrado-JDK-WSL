package br.vianna.vendas.model.impl.cupom;

import br.vianna.vendas.model.faces.ICupom;

public class CupomPercentual implements ICupom {

    private double percentualDesconto;
    @Override
    public double desconto(double total) {
        return total * (percentualDesconto/100);
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public CupomPercentual() {
    }

    public CupomPercentual(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
}

package br.vianna.vendas.model.impl;

import br.vianna.vendas.model.eNUM.EEstado;
import br.vianna.vendas.model.faces.IImposto;

public class ICMS implements IImposto {

    private EEstado estado;

    public ICMS(EEstado estado) {
        this.estado = estado;
    }

    public EEstado getEstado() {
        return estado;
    }

    public void setEstado(EEstado estado) {
        this.estado = estado;
    }

    @Override
    public double valorImposto(double preco) {
        switch (estado){
            case GO:
                return preco * 0.0023;
            case AM:
                return preco * 0.001;
            case ES:
                return  preco * 0.002;
            case MG:
                return  preco * 0.003;
            case RJ:
                return preco * 0.0026;
            case RS:
                return preco * 0.0027;
            case SP:
                return preco * 0.0031;
        }
        return 0;
    }
}

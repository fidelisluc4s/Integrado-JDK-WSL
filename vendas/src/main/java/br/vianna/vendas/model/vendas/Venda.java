package br.vianna.vendas.model.vendas;

import br.vianna.vendas.model.Cliente;
import br.vianna.vendas.model.Produto;
import br.vianna.vendas.model.Usuario;
import br.vianna.vendas.model.faces.ICupom;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Venda {
    private LocalDateTime dataVenda;
    //private ArrayList<Produto> produtos;
    private ArrayList<ItemVenda> produtos;

    private Cliente comprador;

    private ICupom cupom;

    public Venda() {
        this(LocalDateTime.now(), null);
    }

    public Venda(LocalDateTime dataVenda, Cliente comprador) {
        this.dataVenda = dataVenda;
        this.produtos = new ArrayList<>();
        this.comprador = comprador;
    }

    public double totalVenda(){
        double total = 0;
        for(ItemVenda i : produtos){
            total += i.getPrecoVenda() * i.getQuantidade();
        }
        return total - ((cupom!= null)?cupom.desconto(total):0);
    }
}

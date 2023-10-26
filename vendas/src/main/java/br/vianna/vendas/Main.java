package br.vianna.vendas;

import br.vianna.vendas.model.Produto;
import br.vianna.vendas.model.impl.ICMS;
import br.vianna.vendas.model.impl.IVA;
import br.vianna.vendas.model.eNUM.EEstado;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem Vindo!");
        Produto prod = new Produto();
        System.out.println("Nome: ");
        Scanner le = new Scanner(System.in);
        prod.setNome(le.nextLine());
        System.out.println("Preço Custo: ");
        prod.setPreco(le.nextDouble());
        prod.addImposto(new IVA());
        System.out.println("Estado: ");
        String est = le.next().toUpperCase();
        prod.addImposto( new ICMS(EEstado.valueOf(est)));
        System.out.println("Preço Final R$:" + prod.precoVenda());

    }
}
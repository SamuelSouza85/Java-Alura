package PraticandoEncapsulamento;

import PraticandoEncapsulamento.Classes.Produto;

public class CadastroProduto {
    public static void main(String[] args) {
        Produto mouse = new Produto();

        mouse.setName("Mouse");
        mouse.setPrice(-59);

        System.out.printf("Produto: %s\nPreço: %.2f\n", mouse.getName(), mouse.getPrice());
    }
}

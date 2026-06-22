package PraticandoOrientacoesObjetos;

import PraticandoOrientacoesObjetos.Classes.Estoque;

public class ControleEstoque {
    public static void main(String[] args) {
        Estoque item = new Estoque();

        item.produto = "Camiseta";
        item.quantidade = 10;

        item.vender(3);
        item.vender(8);
    }
}

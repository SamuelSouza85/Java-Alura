package PraticandoOrientacoesObjetos.Classes;

public class Estoque {
    public String produto;
    public int quantidade;

    public void vender(int numeroVendas){
        if (quantidade > numeroVendas){
            quantidade -= numeroVendas;
            System.out.printf("Venda realizada. Estoque restante de %s: %d %n", produto, quantidade);
        }else{
            System.out.println("Estoque insuficiente");
        }
    }
}

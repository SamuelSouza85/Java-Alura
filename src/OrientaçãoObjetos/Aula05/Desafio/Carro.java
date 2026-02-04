package OrientaçãoObjetos.Aula05.Desafio;

public class Carro {

    public String modelo;
    public String cor;
    public int anoDeFabricacao;


    public void imprime(){
        System.out.println("O carro é do modelo: " + modelo);
        System.out.println("Tem a cor: " + cor);
        System.out.println("E foi fabricado em: " + anoDeFabricacao );
    }


    public int idade(){
        return 2025 - anoDeFabricacao;
    }
}

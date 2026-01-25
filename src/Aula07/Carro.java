package Aula07;

public class Carro {

    private String modelo;
    private double precoModelo1;
    private double precoModelo2;
    private double precoModelo3;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double precoModelo1, double precoModelo2, double precoModelo3) {
        this.precoModelo1 = precoModelo1;
        this.precoModelo2 = precoModelo2;
        this.precoModelo3 = precoModelo3;
    }

    public double calculaMenorPreco(){
        double menorPreco = precoModelo1;

        if (precoModelo2 < menorPreco){
            menorPreco = precoModelo2;
        }else if (precoModelo3 < menorPreco){
            menorPreco = precoModelo3;
        }

        return  menorPreco;
    }

    public double calculaMaiorPreco(){
        double maiorPreco = precoModelo1;

        if (precoModelo2 > maiorPreco){
            maiorPreco = precoModelo2;
        }else if (precoModelo3 > maiorPreco){
            maiorPreco = precoModelo3;
        }

        return  maiorPreco;
    }

    public void imprime(){
        System.out.println("O carro do modelo " + modelo);
        System.out.println("No primeiro ano o carro custou R$" + precoModelo1);
        System.out.println("No segundo ano o carro custou R$" + precoModelo2);
        System.out.println("No terceiro ano o carro custou R$" + precoModelo3);
        System.out.println("O menor preço foi R$" + calculaMenorPreco());
        System.out.println("O maior preço foi R$" + calculaMaiorPreco());
    }
}

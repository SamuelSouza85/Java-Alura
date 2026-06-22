package PraticandoEncapsulamento.Classes;

public class Produto {
    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double valor) {
        if (valor >= 0){
            price = valor;
        }else{
            System.out.println("Preço inválido");
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

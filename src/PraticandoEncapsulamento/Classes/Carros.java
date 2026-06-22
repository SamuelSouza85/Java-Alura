package PraticandoEncapsulamento.Classes;

public class Carros {

    private String modelo;
    private String placa;
    private int ano;

    public Carros(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

}

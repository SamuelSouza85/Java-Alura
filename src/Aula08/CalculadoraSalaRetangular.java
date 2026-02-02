package Aula08;

import Aula08.Interface.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    private double altura;
    private double largura;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public void calcularArea() {
        double area = altura * largura;
        System.out.println("A área do retangulo é " + area+ "cm²");
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = altura * 2 + largura * 2;
        System.out.println("O perímetro deste retangulo é " + perimetro + "cm");
    }

}

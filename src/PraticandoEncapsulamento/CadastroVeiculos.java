package PraticandoEncapsulamento;

import PraticandoEncapsulamento.Classes.Carros;

public class CadastroVeiculos {
    public static void main(String[] args) {
        Carros gol = new Carros("Gol", "ABC-1234", 2020);

        System.out.println("Veiculo cadastrado:");
        System.out.println("Modelo: " + gol.getModelo());
        System.out.println("Placa: " + gol.getPlaca());
        System.out.println("Ano: " + gol.getAno());
    }
}

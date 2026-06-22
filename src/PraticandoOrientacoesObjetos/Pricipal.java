package PraticandoOrientacoesObjetos;

import PraticandoOrientacoesObjetos.Classes.Funcionario;

public class Pricipal {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "Samuel";
        funcionario1.cargo = "Gerente de projetos";
        funcionario1.salario = 9000;



        Funcionario funcionario2 = new Funcionario();

        funcionario2.nome = "Gabi";
        funcionario2.cargo = "Dev";
        funcionario2.salario = 6000;

        funcionario2.exibir();
        funcionario2.reajustarSalario(5);

    }
}

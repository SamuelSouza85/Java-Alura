package PraticandoOrientacoesObjetos.Classes;

public class Funcionario {
    public String nome;
    public String cargo;
    public double salario;

    public void exibir() {
        System.out.printf("Funcionario: %s - Cargo: %s - Salário %.2f %n", nome, cargo, salario );
    }

    public void reajustarSalario(double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf("Nome salario de %s é %.2f", nome, salario);
    }
}

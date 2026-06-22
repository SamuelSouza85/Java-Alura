package PraticandoOrientacoesObjetos.Classes;

public class Aluno {
    public String nome;
    public double semestre1;
    public double semestre2;

    double media = (semestre1 + semestre2)/2;

    public void exibir(){
        System.out.printf("Aluno: %s %n", nome);
        System.out.printf("1° Semestre: %.2f %n", semestre1);
        System.out.printf("2° Semestre: %.2f %n", semestre2);
        System.out.printf("Média: %.2f %n", media);

        if (media >=7){
            System.out.println("Situação: aprovado");
        }else {
            System.out.println("Situação: reprovado");
        }
    }
}

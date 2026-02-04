package OrientaçãoObjetos.Aula06;

public class Aluno {
    private String nome;
    private double nota0;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota0, double nota1, double nota2) {
        this.nome = nome;
        this.nota0 = nota0;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota0() {
        return nota0;
    }

    public void setNota0(double nota0) {
        this.nota0 = nota0;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia(){
        return (nota0 + nota1 + nota2)/3;
    }
}

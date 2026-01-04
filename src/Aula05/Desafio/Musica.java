package Aula05.Desafio;

public class Musica {

    public String titulo;
    public String artista;
    public int anoDeLancamento;
    public double avaliacao;
    public int numAvaliacao;


    public void imprime(){
        System.out.println("O nome da música é: " + titulo);
        System.out.println("Foi produzido(a) pelo(a) artista: " + artista);
        System.out.println("Foi lançada no ano de: " + anoDeLancamento);
        System.out.println("E o total de avaliações é de: " + numAvaliacao);
    }

    public void avaliar(double nota){
        avaliacao += nota;
        numAvaliacao++;
    }

    public double media(){
        return avaliacao/ numAvaliacao;
    }
}

package Aula05.Screenmatch;

public class Filme {
    String nome;
    String genero;
    int anoDeLancamento;
    boolean inclusoNoPlano;
    double somaDasAvaliacao;
    int totalAvaliacoes;
    int duracaoEmMinutos;
    boolean dublado;

    void imprime(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Gênero do File: " + genero);
        System.out.println("Ano de Lançamento do filme: " + anoDeLancamento);
        if (inclusoNoPlano){
            System.out.println("O filme está incluso no plano");
        }else{
            System.out.println("O filme não está incluso no plano");
        }
        System.out.println("A avalição do filme é de: " + somaDasAvaliacao);
        System.out.println("O total de avaliações do filme é: " + totalAvaliacoes);
        System.out.println("O filme tem um total de " + duracaoEmMinutos+ " minutos de duração");
        if (dublado){
            System.out.println("O filme possui uma versão dublada");
        }else {
            System.out.println("O filme não possui uma versão dublada");
        }
    }

    void  avalia(double nota){
            somaDasAvaliacao += nota;
            totalAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacao / totalAvaliacoes;
    }
}

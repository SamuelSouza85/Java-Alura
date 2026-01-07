package Screenmatch.br.com.alura.screenmatch.modelos;

public class Filme {
    private  String nome;
    private  String genero;
    private int anoDeLancamento;
    private  boolean inclusoNoPlano;
    private double somaDasAvaliacao;
    private int totalAvaliacoes;
    private  int duracaoEmMinutos;
    private  boolean dublado;


    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano) {
        this.inclusoNoPlano = inclusoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isInclusoNoPlano() {
        return inclusoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isDublado() {
        return dublado;
    }

    public void imprime(){
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

    public void  avalia(double nota){
            somaDasAvaliacao += nota;
            totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacao / totalAvaliacoes;
    }
}

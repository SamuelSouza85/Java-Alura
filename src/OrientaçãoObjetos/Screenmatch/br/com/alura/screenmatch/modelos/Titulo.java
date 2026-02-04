package OrientaçãoObjetos.Screenmatch.br.com.alura.screenmatch.modelos;

public class Titulo {    private  String nome;
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
        System.out.println("Nome do Titulo: " + nome);
        System.out.println("Gênero do Titulo: " + genero);
        System.out.println("Ano de Lançamento do Titulo: " + anoDeLancamento);
        if (inclusoNoPlano){
            System.out.println("O Titulo está incluso no plano");
        }else{
            System.out.println("O Titulo não está incluso no plano");
        }
        System.out.println("O total de avaliações do Titulo é: " + totalAvaliacoes);
        System.out.println("O Titulo tem um total de " + duracaoEmMinutos+ " minutos de duração");
        if (dublado){
            System.out.println("O Titulo possui uma versão dublada");
        }else {
            System.out.println("O Titulo não possui uma versão dublada");
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

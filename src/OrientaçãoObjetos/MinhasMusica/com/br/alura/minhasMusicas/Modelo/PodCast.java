package OrientaçãoObjetos.MinhasMusica.com.br.alura.minhasMusicas.Modelo;

public class PodCast extends Audio{

    private String apresentador;
    private String previa;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getPrevia() {
        return previa;
    }

    public void setPrevia(String previa) {
        this.previa = previa;
    }


    @Override
    public int getClasificacao() {
        if (this.getCurtida() > 500){
            return 10;
        } else{
            return 8;
        }
    }
}

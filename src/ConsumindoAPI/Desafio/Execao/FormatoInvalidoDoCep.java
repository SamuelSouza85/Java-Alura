package ConsumindoAPI.Desafio.Execao;

public class FormatoInvalidoDoCep extends RuntimeException{

    private String mensagem;

    public FormatoInvalidoDoCep(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}

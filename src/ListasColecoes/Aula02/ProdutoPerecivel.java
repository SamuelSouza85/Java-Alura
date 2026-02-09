package ListasColecoes.Aula02;

public class ProdutoPerecivel extends Produto{

    private String dataDeValidade;

    public ProdutoPerecivel(String nome, int preco, int quantidade, String dataDeValidade) {
        super(nome, preco, quantidade);
        this.dataDeValidade = dataDeValidade;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return super.toString() + "Data de validade: " + dataDeValidade;
    }
}

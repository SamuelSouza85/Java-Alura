package ConsumindoAPI.Desafio.Modelos;

import ConsumindoAPI.Desafio.Execao.FormatoInvalidoDoCep;
import ConsumindoAPI.Desafio.Record.LocalizarCepRecord;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class LocalizarCep {

    private int cep;
    private String rua;
    private String cidade;
    private String estado;
    private int ddd;
    private String siglaDoEstado;

    public LocalizarCepRecord buscaCep(String cep){

        URI endereco = URI.create("viacep.com.br/ws/" + cep + "/json/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response = null;
        try {
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return  new Gson().fromJson(response.body(), LocalizarCepRecord.class);
    }

    public LocalizarCep(LocalizarCepRecord localizarCepRecord) {
        this.cep = Integer.parseInt(localizarCepRecord.cep());

        if (localizarCepRecord.cep().length() < 8 || localizarCepRecord.cep().length() > 9 ){
            throw new FormatoInvalidoDoCep("Você digitou mais do que 8 números ou menos do que 8");
        }

        this.rua = localizarCepRecord.logradouro();
        this.cidade = localizarCepRecord.localidade();
        this.ddd = Integer.parseInt(localizarCepRecord.ddd());
        this.siglaDoEstado = localizarCepRecord.uf();

    }
    public int getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public int getDdd() {
        return ddd;
    }

    public String getSiglaDoEstado() {
        return siglaDoEstado;
    }

    @Override
    public String toString() {
        return "LocalizarCep(" +
                "cep=" + cep +
                ", rua='" + rua + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", ddd=" + ddd +
                ", siglaDoEstado='" + siglaDoEstado + '\'' +
                ')';
    }
}

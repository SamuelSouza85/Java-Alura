package ConsumindoAPI.Desafio.Principal;

import ConsumindoAPI.Desafio.Execao.FormatoInvalidoDoCep;
import ConsumindoAPI.Desafio.Modelos.LocalizarCep;
import ConsumindoAPI.Desafio.Record.LocalizarCepRecord;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.Scanner;

public class ConsultaCep {
    public static void main(String[] args) {

        LocalizarCep localizarCep = new LocalizarCep();
        LocalizarCepRecord novoCep = localizarCep.buscaCep("08320100");
        System.out.println(novoCep);
        Scanner scanner = new Scanner(System.in);
    }
}

package ConsumindoAPI.Aula01;

import ConsumindoAPI.Aula01.Record.Livro;
import com.google.gson.Gson;

public class ConversaoJsonParaObjetosFlexivel {
    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Vidas Secas\",\"autor\":\"Cara lá\",\"editora\":{\"nome\":\"Principis\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);
        System.out.println(livro);
    }
}

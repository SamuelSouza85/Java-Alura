package OrientaçãoObjetos.MinhasMusica.com.br.alura.minhasMusicas.Modelo;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClasificacao() >= 9){
            System.out.println(audio.getTitulo() + " é uma das preferidinhas da galera");
        }else {
            System.out.println(audio.getTitulo() + " é umas do momento");
        }
    }
}

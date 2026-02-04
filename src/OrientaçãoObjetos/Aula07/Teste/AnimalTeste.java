package OrientaçãoObjetos.Aula07.Teste;

import OrientaçãoObjetos.Aula07.SubClasses.Cachorro;
import OrientaçãoObjetos.Aula07.SubClasses.Gato;

public class AnimalTeste {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        System.out.println("-----------------------");

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharSofa();
    }
}

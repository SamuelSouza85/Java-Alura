package ListasColecoes.Aula03.Teste;

import ListasColecoes.Aula03.Animal;
import ListasColecoes.Aula03.Subclasses.Cachorro;

public class CachorroTeste {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
        }else {
            System.out.println("O objeto não é cachorro");
        }
    }
}

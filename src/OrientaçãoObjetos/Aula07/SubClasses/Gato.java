package OrientaçãoObjetos.Aula07.SubClasses;

import OrientaçãoObjetos.Aula07.Animal;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miau miau");
    }

    public void arranharSofa(){
        System.out.println("Gato arrando o sofá");
    }
}

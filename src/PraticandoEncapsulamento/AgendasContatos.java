package PraticandoEncapsulamento;

import PraticandoEncapsulamento.Classes.Contatos;

import java.util.ArrayList;

public class AgendasContatos {
    public static void main(String[] args) {
        ArrayList<Contatos> contatos = new ArrayList<>();
        contatos.add(new Contatos("João Silva", "(11) 99999-0000"));
        contatos.add(new Contatos("Luana Santos", "(21) 98888-0000"));
        contatos.add(new Contatos("Pedro Oliveira", "(31) 97777-0000"));

        System.out.println("Lista de contatos:");
        int indice = 1;
        for (Contatos contato : contatos) {
            System.out.printf("%d. %s - %s %n",
                    indice++,
                    contato.getNome(),
                    contato.getNumero());
        }
    }
}

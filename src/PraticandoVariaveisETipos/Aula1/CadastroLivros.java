package PraticandoVariaveisETipos.Aula1;

import PraticandoVariaveisETipos.Aula1.Domino.Livros;

import java.util.Scanner;

public class CadastroLivros {
    public static void main(String[] args) {
        Livros livro1 = new Livros("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 96, 39.90);
        Livros livro2 = new Livros("Diário de Anne Frank", "Anne Frank", 445, 20.90);
        Livros livro3 = new Livros("Marketing 5.0: Tecnologia para a humanidade", "Philip Kotler", 257, 43.90);
        Livros livro4 = new Livros("Sapiens: Uma Breve História da Humanidade", "Yuval Noah Harari", 443, 44.95);
        Scanner scanner = new Scanner(System.in);
        String categoria = "";
        System.out.println("Selecione uma das categorias");
        categoria = scanner.nextLine();

        if (categoria.equalsIgnoreCase("f")){
            System.out.println(livro1);
        }else if (categoria.equalsIgnoreCase("n")){
            System.out.println(livro2);
        }else if (categoria.equalsIgnoreCase("t")){
            System.out.println(livro3);
        }else if (categoria.equalsIgnoreCase("h")){
            System.out.println(livro4);
        }else{
            System.out.println("Categoria invalida");
        }




    }
}

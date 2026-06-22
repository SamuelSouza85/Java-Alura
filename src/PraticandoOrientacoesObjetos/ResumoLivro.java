package PraticandoOrientacoesObjetos;

import PraticandoOrientacoesObjetos.Classes.Livro;

import java.util.Scanner;

public class ResumoLivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livro livro = new Livro();

        System.out.println("1.Titulo = ");
        livro.titulo = scanner.nextLine();
        System.out.println("1.Autor = ");
        livro.autor = scanner.nextLine();
        System.out.println("1.páginas = ");
        livro.pagina = scanner.nextInt();

        livro.exibir();
    }
}

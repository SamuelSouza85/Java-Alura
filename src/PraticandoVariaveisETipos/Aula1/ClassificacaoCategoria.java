package PraticandoVariaveisETipos.Aula1;

public class ClassificacaoCategoria {
    public static void main(String[] args) {
        double preco = 150.00;

        if (preco<50){
            System.out.println("Categoria do produto: Economico");
        } else if (preco > 50.01 || preco < 200.00) {
            System.out.println("Categoria do produto: Intermediário");
        } else {
            System.out.println("Categoria do produto: Premium");
        }
    }
}

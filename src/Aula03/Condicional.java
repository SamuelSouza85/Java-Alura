package Aula03;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamentos que os clientes estão curtindo");
        }else{
            System.out.println("Filme retro que vale a pena assitir");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Você pode assitir sem problema o filme");
        }else{
            System.out.println("Deve pagar a locação");
        }
    }
}

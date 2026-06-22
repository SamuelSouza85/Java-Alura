package DatasHorarios.Desafios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrazoEntrega {
    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate prazo = dataHoje.plusDays(15);

        System.out.println("Data de entrega: " + prazo.format(formatter));
    }
}

package DatasHorarios.Desafios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LembretePagamento {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2026, 06, 25);
        LocalDate lembrete = dataVencimento.minusDays(5);
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Data do lembrete: " + lembrete.format(formatoData));
    }
}

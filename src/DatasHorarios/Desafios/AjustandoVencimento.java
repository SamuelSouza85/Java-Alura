package DatasHorarios.Desafios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AjustandoVencimento {
    public static void main(String[] args) {
        LocalDate dataVencimentoOriginal = LocalDate.of(2026,6,2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataVencimento = dataVencimentoOriginal.plusMonths(1);

        System.out.println("Nova data de vencimento: " + dataVencimento.format(formatter));
    }
}

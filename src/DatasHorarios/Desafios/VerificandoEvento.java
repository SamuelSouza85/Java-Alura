package DatasHorarios.Desafios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VerificandoEvento {
    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();
        LocalDate dataEvento = LocalDate.of(2026, 06, 05);
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data do evento: " + dataEvento.format(formatoData));
        System.out.println("Data Atual: " + dataHoje.format(formatoData));

        if (dataHoje.isEqual(dataEvento)){
            System.out.println("O evento é hoje");
        }else if (dataHoje.isAfter(dataEvento)){
            System.out.println("O envento ja ocorreu");
        }else {
            System.out.println("O evento ainda não aconteceu");
        }
    }
}

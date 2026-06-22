package DatasHorarios;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Principal {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiParcela = LocalDate.of(2026, 6 , 2);
        LocalDate dataSegundaParcela = dataPrimeiParcela.plusDays(30);


        if (dataPrimeiParcela.isEqual(dataCompra)){
            System.out.println("Hoje é o dia do vencimento");
        }else if (dataPrimeiParcela.isAfter(dataCompra)){
            System.out.println("A parcela já venceu");
        }else {
            System.out.println("Parcela ainda não venceu");
        }

        System.out.println("Data compra:" + dataCompra);
        System.out.println("Data de primeira parcela:" + dataPrimeiParcela);
        System.out.println("Data de segunda parcela:" + dataSegundaParcela);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("----------------------------------");

        System.out.println("Data compra:" + dataCompra.format(formato));
        System.out.println("Data de primeira parcela:" + dataPrimeiParcela.format(formato));
        System.out.println("Data de segunda parcela:" + dataSegundaParcela.format(formato));

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();

        System.out.println("Data conclusão compra:" + dataConclusaoCompra);

        ZonedDateTime dataCompraNy = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("Data conclusão compra Ny:" + dataCompraNy);

        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);

        Duration duracao = Duration.between(inicio, fim);

        System.out.println("Duração expedição: " + duracao.toHoursPart() + "h" + duracao.toMinutesPart() + "min");

        LocalDate dataPagamento = LocalDate.parse("2026-05-25");
        long dias = Math.abs(ChronoUnit.DAYS.between(dataCompra, dataPagamento));
        System.out.println("Diferença em dias: " + dias);

    }
}

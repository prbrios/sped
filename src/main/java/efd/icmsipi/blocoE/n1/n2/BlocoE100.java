package efd.icmsipi.blocoE.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class BlocoE100 {

    @Inclui
    private final String reg = "E100";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

}
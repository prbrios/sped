package efd.icmsipi.blocoE.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.BlocoE110;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoE100 {

    @Inclui
    private final String reg = "E100";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Filho
    private BlocoE110 blocoE110;

}
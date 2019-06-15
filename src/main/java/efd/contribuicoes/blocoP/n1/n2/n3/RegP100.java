package efd.contribuicoes.blocoP.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegP100 {

    //TODO: verificar layout

    @Inclui
    private final String reg = "P100";

    private LocalDate dtIni;
    private LocalDate dtFin;
    private BigDecimal vlRecTotEst;


}

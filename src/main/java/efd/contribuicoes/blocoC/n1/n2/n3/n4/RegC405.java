package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegC405 {

    @Inclui
    private final String reg = "C405";

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private Integer cro;

    @Inclui
    private Integer crz;

    @Inclui
    private Integer numCooFin;

    @Inclui
    private BigDecimal gtFin;

    @Inclui
    private BigDecimal vlBrt;

}
package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegM600 {

    @Inclui
    private final String reg = "M600";

    @Inclui
    private BigDecimal vlTotContNcPer;

    @Inclui
    private BigDecimal vlTotCredDesc;

    @Inclui
    private BigDecimal vltotCredDescAnt;

    @Inclui
    private BigDecimal vltotContNcDev;

    @Inclui
    private BigDecimal vlRetNc;

    @Inclui
    private BigDecimal vlOutDedNc;

    @Inclui
    private BigDecimal vlContNcRec;

    @Inclui
    private BigDecimal vlTotContCumPer;

    @Inclui
    private BigDecimal vlRetCum;

    @Inclui
    private BigDecimal vlOutDedCum;

    @Inclui
    private BigDecimal vlContCumRec;

    @Inclui
    private BigDecimal vlTotContRec;

}

package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlInlineBinaryData;
import java.math.BigDecimal;

@Getter
@Setter
public class RegM200 {

    @Inclui
    private final String reg = "M200";

    @Inclui
    private BigDecimal vlTotContNcPer;

    @Inclui
    private BigDecimal vlTotCredDesc;

    @Inclui
    private BigDecimal vlTotCredDescAnt;

    @Inclui
    private BigDecimal vlTotContNcDev;

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

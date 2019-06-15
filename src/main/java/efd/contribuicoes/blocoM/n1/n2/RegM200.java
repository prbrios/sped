package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlInlineBinaryData;
import java.math.BigDecimal;

public class RegM200 {

    @Getter @Inclui
    private final String reg = "M200";

    @Getter @Inclui
    private BigDecimal vlTotContNcPer;

    @Getter @Inclui
    private BigDecimal vlTotCredDesc;

    @Getter @Inclui
    private BigDecimal vlTotCredDescAnt;

    @Getter @Inclui
    private BigDecimal vlTotContNcDev;

    @Getter @Inclui
    private BigDecimal vlRetNc;

    @Getter @Inclui
    private BigDecimal vlOutDedNc;

    @Getter @Inclui
    private BigDecimal vlContNcRec;

    @Getter @Inclui
    private BigDecimal vlTotContCumPer;

    @Getter @Inclui
    private BigDecimal vlRetCum;

    @Getter @Inclui
    private BigDecimal vlOutDedCum;

    @Getter @Inclui
    private BigDecimal vlContCumRec;

    @Getter @Inclui
    private BigDecimal vlTotContRec;

    public RegM200(BigDecimal vlTotContNcPer, BigDecimal vlTotCredDesc, BigDecimal vlTotCredDescAnt, BigDecimal vlTotContNcDev, BigDecimal vlRetNc, BigDecimal vlOutDedNc, BigDecimal vlContNcRec, BigDecimal vlTotContCumPer, BigDecimal vlRetCum, BigDecimal vlOutDedCum, BigDecimal vlContCumRec, BigDecimal vlTotContRec) {
        this.vlTotContNcPer = vlTotContNcPer;
        this.vlTotCredDesc = vlTotCredDesc;
        this.vlTotCredDescAnt = vlTotCredDescAnt;
        this.vlTotContNcDev = vlTotContNcDev;
        this.vlRetNc = vlRetNc;
        this.vlOutDedNc = vlOutDedNc;
        this.vlContNcRec = vlContNcRec;
        this.vlTotContCumPer = vlTotContCumPer;
        this.vlRetCum = vlRetCum;
        this.vlOutDedCum = vlOutDedCum;
        this.vlContCumRec = vlContCumRec;
        this.vlTotContRec = vlTotContRec;
    }

    public RegM200(){}
}

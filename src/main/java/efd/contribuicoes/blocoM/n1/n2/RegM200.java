package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM205;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM210;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlInlineBinaryData;
import java.math.BigDecimal;
import java.util.List;

public class RegM200 {

    @Getter @Inclui
private final String reg = "M200";

    @Getter @Setter @Inclui
    private BigDecimal vlTotContNcPer;

    @Getter @Setter @Inclui
    private BigDecimal vlTotCredDesc;

    @Getter @Setter @Inclui
    private BigDecimal vlTotCredDescAnt;

    @Getter @Setter @Inclui
    private BigDecimal vlTotContNcDev;

    @Getter @Setter @Inclui
    private BigDecimal vlRetNc;

    @Getter @Setter @Inclui
    private BigDecimal vlOutDedNc;

    @Getter @Setter @Inclui
    private BigDecimal vlContNcRec;

    @Getter @Setter @Inclui
    private BigDecimal vlTotContCumPer;

    @Getter @Setter @Inclui
    private BigDecimal vlRetCum;

    @Getter @Setter @Inclui
    private BigDecimal vlOutDedCum;

    @Getter @Setter @Inclui
    private BigDecimal vlContCumRec;

    @Getter @Setter @Inclui
    private BigDecimal vlTotContRec;

    @Getter @Setter @Filho
    private List<RegM205> regM205;

    @Getter @Setter @Filho
    private List<RegM210> regM210;

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

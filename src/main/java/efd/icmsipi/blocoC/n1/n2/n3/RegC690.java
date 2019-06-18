package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegC690 {

    @Getter @Inclui
    private final String reg = "C690";

    @Getter @Setter @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Getter @Setter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Setter @Inclui
    private BigDecimal aliqIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlOpr;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlRedBc;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcmsSt;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsSt;

    @Getter @Setter @Inclui
    private String codObs;

    public RegC690(Integer cstIcms, Integer cfop, BigDecimal aliqIcms, BigDecimal vlOpr, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlRedBc, BigDecimal vlBcIcmsSt, BigDecimal vlIcmsSt, String codObs) {
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.aliqIcms = aliqIcms;
        this.vlOpr = vlOpr;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlRedBc = vlRedBc;
        this.vlBcIcmsSt = vlBcIcmsSt;
        this.vlIcmsSt = vlIcmsSt;
        this.codObs = codObs;
    }

    public RegC690(){}
}
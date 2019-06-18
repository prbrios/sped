package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegD590 {

    @Getter @Inclui
    private final String reg = "D590";

    @Getter @Setter @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Getter @Setter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Setter @Inclui
    private BigDecimal aliqIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlOper;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcmsUf;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsUf;

    @Getter @Setter @Inclui
    private BigDecimal vlRedBc;

    @Getter @Setter @Inclui
    private String codObs;

    public RegD590(Integer cstIcms, Integer cfop, BigDecimal aliqIcms, BigDecimal vlOper, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsUf, BigDecimal vlIcmsUf, BigDecimal vlRedBc, String codObs) {
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.aliqIcms = aliqIcms;
        this.vlOper = vlOper;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsUf = vlBcIcmsUf;
        this.vlIcmsUf = vlIcmsUf;
        this.vlRedBc = vlRedBc;
        this.codObs = codObs;
    }

    public RegD590(){}
}
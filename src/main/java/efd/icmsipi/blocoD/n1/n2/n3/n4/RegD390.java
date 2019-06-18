package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegD390 {

    @Getter @Inclui
    private final String reg = "D390";

    @Getter @Setter @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Getter @Setter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Setter @Inclui
    private BigDecimal aliqIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlOpr;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIssqn;

    @Getter @Setter @Inclui
    private BigDecimal aliqIssqn;

    @Getter @Setter @Inclui
    private BigDecimal vlIssqn;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    @Getter @Setter @Inclui
    private String codObs;

    public RegD390(Integer cstIcms, Integer cfop, BigDecimal aliqIcms, BigDecimal vlOpr, BigDecimal vlBcIssqn, BigDecimal aliqIssqn, BigDecimal vlIssqn, BigDecimal vlBcIcms, BigDecimal vlIcms, String codObs) {
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.aliqIcms = aliqIcms;
        this.vlOpr = vlOpr;
        this.vlBcIssqn = vlBcIssqn;
        this.aliqIssqn = aliqIssqn;
        this.vlIssqn = vlIssqn;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.codObs = codObs;
    }

    public RegD390(){}
}
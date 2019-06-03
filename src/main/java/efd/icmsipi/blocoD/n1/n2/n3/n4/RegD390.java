package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegD390 {

    @Inclui
    private final String reg = "D390";

    @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private BigDecimal vlOpr;

    @Inclui
    private BigDecimal vlBcIssqn;

    @Inclui
    private BigDecimal aliqIssqn;

    @Inclui
    private BigDecimal vlIssqn;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
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
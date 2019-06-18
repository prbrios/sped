package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegC890 {

    @Getter @Inclui
    private final String reg = "C890";

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
    private BigDecimal vlicms;

    @Getter @Setter @Inclui
    private String codObs;

    public RegC890(Integer cstIcms, Integer cfop, BigDecimal aliqIcms, BigDecimal vlOpr, BigDecimal vlBcIcms, BigDecimal vlicms, String codObs) {
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.aliqIcms = aliqIcms;
        this.vlOpr = vlOpr;
        this.vlBcIcms = vlBcIcms;
        this.vlicms = vlicms;
        this.codObs = codObs;
    }

    public RegC890(){}
}
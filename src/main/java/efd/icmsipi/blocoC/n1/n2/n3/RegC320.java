package efd.icmsipi.blocoC.n1.n2.n3;

import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC321;
import lombok.Getter;
import lombok.Setter;


public class RegC320 {

    @Getter @Inclui
    private final String reg = "C320";

    @Getter @Setter @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Getter @Setter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Setter @Inclui
    private BigDecimal aliqIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlOpr;

    @Getter @Setter @Inclui
    private BigDecimal vlbcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlRedBc;

    @Getter @Setter @Inclui
    private String codObs;

    @Getter @Setter @Filho
    private List<RegC321> regC321;

    public RegC320(Integer cstIcms, Integer cfop, BigDecimal aliqIcms, BigDecimal vlOpr, BigDecimal vlbcIcms, BigDecimal vlIcms, BigDecimal vlRedBc, String codObs) {
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.aliqIcms = aliqIcms;
        this.vlOpr = vlOpr;
        this.vlbcIcms = vlbcIcms;
        this.vlIcms = vlIcms;
        this.vlRedBc = vlRedBc;
        this.codObs = codObs;
    }

    public RegC320(){}
}

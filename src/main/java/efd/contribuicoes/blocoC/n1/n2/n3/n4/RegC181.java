package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegC181 {

    @Getter @Inclui
    private final String reg = "C181";

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Inclui
    private BigDecimal vlItem;

    @Getter @Inclui
    private BigDecimal vlDesc;

    @Getter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPisQuant;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui
    private String codCta;

    public RegC181(Integer cstPis, Integer cfop, BigDecimal vlItem, BigDecimal vlDesc, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal quantBcPis, BigDecimal aliqPisQuant, BigDecimal vlPis, String codCta) {
        this.cstPis = cstPis;
        this.cfop = cfop;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.quantBcPis = quantBcPis;
        this.aliqPisQuant = aliqPisQuant;
        this.vlPis = vlPis;
        this.codCta = codCta;
    }

    public RegC181(){}
}

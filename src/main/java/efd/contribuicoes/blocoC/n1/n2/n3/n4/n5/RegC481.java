package efd.contribuicoes.blocoC.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegC481 {

    @Getter @Inclui
    private final String reg = "C481";

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui
    private BigDecimal vlItem;

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
    private String codItem;

    @Getter @Inclui
    private String codCta;

    public RegC481(Integer cstPis, BigDecimal vlItem, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal quantBcPis, BigDecimal aliqPisQuant, BigDecimal vlPis, String codItem, String codCta) {
        this.cstPis = cstPis;
        this.vlItem = vlItem;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.quantBcPis = quantBcPis;
        this.aliqPisQuant = aliqPisQuant;
        this.vlPis = vlPis;
        this.codItem = codItem;
        this.codCta = codCta;
    }

    public RegC481(){}
}

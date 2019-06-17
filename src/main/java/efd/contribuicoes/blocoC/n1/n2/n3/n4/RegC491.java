package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegC491 {

    @Getter @Inclui
private final String reg = "C491";

    @Getter @Setter @Inclui
    private String docItem;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Setter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Setter @Inclui
    private BigDecimal vlItem;

    @Getter @Setter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPisQuant;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private String codCta;

    public RegC491(String docItem, Integer cstPis, Integer cfop, BigDecimal vlItem, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal quantBcPis, BigDecimal aliqPisQuant, BigDecimal vlPis, String codCta) {
        this.docItem = docItem;
        this.cstPis = cstPis;
        this.cfop = cfop;
        this.vlItem = vlItem;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.quantBcPis = quantBcPis;
        this.aliqPisQuant = aliqPisQuant;
        this.vlPis = vlPis;
        this.codCta = codCta;
    }

    public RegC491(){}
}

package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegC880 {

    @Getter @Inclui
    private final String reg = "C880";

    @Getter @Inclui
    private String codItem;

    @Getter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Inclui
    private BigDecimal vlItem;

    @Getter @Inclui
    private BigDecimal vlDesc;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPisQuant;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofinsQuant;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Inclui
    private String codCta;

    public RegC880(String codItem, Integer cfop, BigDecimal vlItem, BigDecimal vlDesc, Integer cstPis, BigDecimal quantBcPis, BigDecimal aliqPisQuant, BigDecimal vlPis, Integer cstCofins, BigDecimal quantBcCofins, BigDecimal aliqCofinsQuant, BigDecimal vlCofins, String codCta) {
        this.codItem = codItem;
        this.cfop = cfop;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
        this.cstPis = cstPis;
        this.quantBcPis = quantBcPis;
        this.aliqPisQuant = aliqPisQuant;
        this.vlPis = vlPis;
        this.cstCofins = cstCofins;
        this.quantBcCofins = quantBcCofins;
        this.aliqCofinsQuant = aliqCofinsQuant;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
    }

    public RegC880(){}
}

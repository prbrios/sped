package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegC495 {

    @Getter @Inclui
    private final String reg = "C495";

    @Getter @Inclui
    private String docItem;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Inclui
    private BigDecimal vlItem;

    @Getter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofinsQuant;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Inclui
    private String codCta;

    public RegC495(String docItem, Integer cstCofins, Integer cfop, BigDecimal vlItem, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal quantBcCofins, BigDecimal aliqCofinsQuant, BigDecimal vlCofins, String codCta) {
        this.docItem = docItem;
        this.cstCofins = cstCofins;
        this.cfop = cfop;
        this.vlItem = vlItem;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.quantBcCofins = quantBcCofins;
        this.aliqCofinsQuant = aliqCofinsQuant;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
    }

    public RegC495(){ }
}

package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegC870 {

    @Getter @Inclui
    private final String reg = "C870";

    @Getter @Inclui
    private String docItem;

    @Getter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Inclui
    private BigDecimal vlItem;

    @Getter @Inclui
    private BigDecimal vlDesc;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Inclui
    private String codCta;

    public RegC870(String docItem, Integer cfop, BigDecimal vlItem, BigDecimal vlDesc, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, Integer cstCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String codCta) {
        this.docItem = docItem;
        this.cfop = cfop;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
        this.cstPis = cstPis;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.cstCofins = cstCofins;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
    }

    public RegC870(){}
}

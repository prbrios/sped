package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegC175 {

    @Getter @Inclui
    private final String reg = "C175";

    @Getter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Inclui
    private BigDecimal vlOpr;

    @Getter @Inclui
    private BigDecimal vlDesc;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

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

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

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

    @Getter @Inclui
    private String infoCompl;

    public RegC175(Integer cfop, BigDecimal vlOpr, BigDecimal vlDesc, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal quantBcPis, BigDecimal aliqPisQuant, BigDecimal vlPis, Integer cstCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal quantBcCofins, BigDecimal aliqCofinsQuant, BigDecimal vlCofins, String codCta, String infoCompl) {
        this.cfop = cfop;
        this.vlOpr = vlOpr;
        this.vlDesc = vlDesc;
        this.cstPis = cstPis;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.quantBcPis = quantBcPis;
        this.aliqPisQuant = aliqPisQuant;
        this.vlPis = vlPis;
        this.cstCofins = cstCofins;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.quantBcCofins = quantBcCofins;
        this.aliqCofinsQuant = aliqCofinsQuant;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
        this.infoCompl = infoCompl;
    }

    public RegC175(){}
}

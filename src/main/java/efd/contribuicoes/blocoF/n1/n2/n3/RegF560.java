package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegF560 {

    @Inclui
    private final String reg = "F560";

    @Inclui
    private BigDecimal vlRecComp;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui
    private BigDecimal vlDescPis;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPisQuant;

    @Inclui
    private BigDecimal vlPis;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui
    private BigDecimal vlDescCofins;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofinsQuant;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codMod;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private String codCta;

    @Inclui
    private String infoCompl;

    public RegF560(BigDecimal vlRecComp, Integer cstPis, BigDecimal vlDescPis, BigDecimal quantBcPis, BigDecimal aliqPisQuant, BigDecimal vlPis, Integer cstCofins, BigDecimal vlDescCofins, BigDecimal quantBcCofins, BigDecimal aliqCofinsQuant, BigDecimal vlCofins, String codMod, Integer cfop, String codCta, String infoCompl) {
        this.vlRecComp = vlRecComp;
        this.cstPis = cstPis;
        this.vlDescPis = vlDescPis;
        this.quantBcPis = quantBcPis;
        this.aliqPisQuant = aliqPisQuant;
        this.vlPis = vlPis;
        this.cstCofins = cstCofins;
        this.vlDescCofins = vlDescCofins;
        this.quantBcCofins = quantBcCofins;
        this.aliqCofinsQuant = aliqCofinsQuant;
        this.vlCofins = vlCofins;
        this.codMod = codMod;
        this.cfop = cfop;
        this.codCta = codCta;
        this.infoCompl = infoCompl;
    }

    public RegF560(){}
}

package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegC170 {

    @Getter @Inclui
    private final String reg = "C170";

    @Getter @Inclui
    private Integer numItem;

    @Getter @Inclui
    private String codItem;

    @Getter @Inclui
    private String descrCompl;

    @Getter @Inclui(casasDecimais = 5)
    private BigDecimal qtd;

    @Getter @Inclui
    private String unid;

    @Getter @Inclui
    private BigDecimal vlItem;

    @Getter @Inclui
    private BigDecimal vlDesc;

    @Getter @Inclui
    private String indMov;

    @Getter @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Getter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Inclui
    private String codNat;

    @Getter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Inclui
    private BigDecimal aliqIcms;

    @Getter @Inclui
    private BigDecimal vlIcms;

    @Getter @Inclui
    private BigDecimal vlBcIcmsSt;

    @Getter @Inclui
    private BigDecimal aliqSt;

    @Getter @Inclui
    private BigDecimal vlIcmsSt;

    @Getter @Inclui
    private String indApur;

    @Getter @Inclui
    private Integer cstIpi;

    @Getter @Inclui
    private String codEnq;

    @Getter @Inclui
    private BigDecimal vlBcIpi;

    @Getter @Inclui
    private BigDecimal aliqIpi;

    @Getter @Inclui
    private BigDecimal vlIpi;

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

    public RegC170(Integer numItem, String codItem, String descrCompl, BigDecimal qtd, String unid, BigDecimal vlItem, BigDecimal vlDesc, String indMov, Integer cstIcms, Integer cfop, String codNat, BigDecimal vlBcIcms, BigDecimal aliqIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsSt, BigDecimal aliqSt, BigDecimal vlIcmsSt, String indApur, Integer cstIpi, String codEnq, BigDecimal vlBcIpi, BigDecimal aliqIpi, BigDecimal vlIpi, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal quantBcPis, BigDecimal aliqPisQuant, BigDecimal vlPis, Integer cstCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal quantBcCofins, BigDecimal aliqCofinsQuant, BigDecimal vlCofins, String codCta) {
        this.numItem = numItem;
        this.codItem = codItem;
        this.descrCompl = descrCompl;
        this.qtd = qtd;
        this.unid = unid;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
        this.indMov = indMov;
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.codNat = codNat;
        this.vlBcIcms = vlBcIcms;
        this.aliqIcms = aliqIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsSt = vlBcIcmsSt;
        this.aliqSt = aliqSt;
        this.vlIcmsSt = vlIcmsSt;
        this.indApur = indApur;
        this.cstIpi = cstIpi;
        this.codEnq = codEnq;
        this.vlBcIpi = vlBcIpi;
        this.aliqIpi = aliqIpi;
        this.vlIpi = vlIpi;
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
    }

    public RegC170(){ }
}

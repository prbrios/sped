package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegD510 {

    @Inclui
    private final String reg = "D510";

    @Inclui
    private Integer numItem;

    @Inclui
    private String codItem;

    @Inclui
    private Integer codClass;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Inclui
    private String unid;

    @Inclui
    private BigDecimal vlItem;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Inclui(zerosEsquerda = 4)
    private String cfop;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlBcIcmsUf;

    @Inclui
    private BigDecimal vlIcmsUf;

    @Inclui
    private String indRec;

    @Inclui
    private String codPart;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codCta;

    public RegD510(Integer numItem, String codItem, Integer codClass, BigDecimal qtd, String unid, BigDecimal vlItem, BigDecimal vlDesc, Integer cstIcms, String cfop, BigDecimal vlBcIcms, BigDecimal aliqIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsUf, BigDecimal vlIcmsUf, String indRec, String codPart, BigDecimal vlPis, BigDecimal vlCofins, String codCta) {
        this.numItem = numItem;
        this.codItem = codItem;
        this.codClass = codClass;
        this.qtd = qtd;
        this.unid = unid;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.vlBcIcms = vlBcIcms;
        this.aliqIcms = aliqIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsUf = vlBcIcmsUf;
        this.vlIcmsUf = vlIcmsUf;
        this.indRec = indRec;
        this.codPart = codPart;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
    }

    public RegD510(){}
}
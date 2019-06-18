package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegD610 {

    @Getter @Inclui
    private final String reg = "D610";

    @Getter @Setter @Inclui
    private Integer codClass;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Getter @Setter @Inclui
    private String unid;

    @Getter @Setter @Inclui
    private BigDecimal vlItem;

    @Getter @Setter @Inclui
    private BigDecimal vlDesc;

    @Getter @Setter @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Getter @Setter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Setter @Inclui
    private BigDecimal aliqIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcmsUf;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsUf;

    @Getter @Setter @Inclui
    private BigDecimal vlRedBc;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private String codCta;

    public RegD610(Integer codClass, String codItem, BigDecimal qtd, String unid, BigDecimal vlItem, BigDecimal vlDesc, Integer cstIcms, Integer cfop, BigDecimal aliqIcms, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsUf, BigDecimal vlIcmsUf, BigDecimal vlRedBc, BigDecimal vlPis, BigDecimal vlCofins, String codCta) {
        this.codClass = codClass;
        this.codItem = codItem;
        this.qtd = qtd;
        this.unid = unid;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.aliqIcms = aliqIcms;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsUf = vlBcIcmsUf;
        this.vlIcmsUf = vlIcmsUf;
        this.vlRedBc = vlRedBc;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
    }

    public RegD610(){}
}
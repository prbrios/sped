package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegD610 implements Serializable {
	private static final long serialVersionUID = 7402001115562874522L;

	@Inclui
    private final String reg = "D610";

    @Inclui
    private Integer codClass;

    @Inclui
    private String codItem;

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
    private Integer cfop;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlBcIcmsUf;

    @Inclui
    private BigDecimal vlIcmsUf;

    @Inclui
    private BigDecimal vlRedBc;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
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

    public String getReg() {
        return reg;
    }

    public Integer getCodClass() {
        return codClass;
    }

    public void setCodClass(Integer codClass) {
        this.codClass = codClass;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getVlItem() {
        return vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public Integer getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(Integer cstIcms) {
        this.cstIcms = cstIcms;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public BigDecimal getVlBcIcmsUf() {
        return vlBcIcmsUf;
    }

    public void setVlBcIcmsUf(BigDecimal vlBcIcmsUf) {
        this.vlBcIcmsUf = vlBcIcmsUf;
    }

    public BigDecimal getVlIcmsUf() {
        return vlIcmsUf;
    }

    public void setVlIcmsUf(BigDecimal vlIcmsUf) {
        this.vlIcmsUf = vlIcmsUf;
    }

    public BigDecimal getVlRedBc() {
        return vlRedBc;
    }

    public void setVlRedBc(BigDecimal vlRedBc) {
        this.vlRedBc = vlRedBc;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
}
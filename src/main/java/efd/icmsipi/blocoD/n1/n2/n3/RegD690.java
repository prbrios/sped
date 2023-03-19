package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegD690 implements Serializable {
	private static final long serialVersionUID = -5600144522082018331L;

	@Inclui
    private final String reg = "D690";

    @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private BigDecimal vlOpr;

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
    private String codObs;

    public RegD690(Integer cstIcms, Integer cfop, BigDecimal aliqIcms, BigDecimal vlOpr, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsUf, BigDecimal vlIcmsUf, BigDecimal vlRedBc, String codObs) {
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.aliqIcms = aliqIcms;
        this.vlOpr = vlOpr;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsUf = vlBcIcmsUf;
        this.vlIcmsUf = vlIcmsUf;
        this.vlRedBc = vlRedBc;
        this.codObs = codObs;
    }

    public RegD690(){}

    public String getReg() {
        return reg;
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

    public BigDecimal getVlOpr() {
        return vlOpr;
    }

    public void setVlOpr(BigDecimal vlOpr) {
        this.vlOpr = vlOpr;
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

    public String getCodObs() {
        return codObs;
    }

    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }
    
}
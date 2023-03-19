package efd.icmsipi.blocoD.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegD370 implements Serializable {
	private static final long serialVersionUID = -1124689598850756658L;

	@Inclui
    private final String reg = "D370";

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui
    private BigDecimal vlServ;

    @Inclui
    private Integer qtdBilh;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    public RegD370(Integer codMunOrig, BigDecimal vlServ, Integer qtdBilh, BigDecimal vlBcIcms, BigDecimal vlIcms) {
        this.codMunOrig = codMunOrig;
        this.vlServ = vlServ;
        this.qtdBilh = qtdBilh;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
    }

    public RegD370(){}

    public String getReg() {
        return reg;
    }

    public Integer getCodMunOrig() {
        return codMunOrig;
    }

    public void setCodMunOrig(Integer codMunOrig) {
        this.codMunOrig = codMunOrig;
    }

    public BigDecimal getVlServ() {
        return vlServ;
    }

    public void setVlServ(BigDecimal vlServ) {
        this.vlServ = vlServ;
    }

    public Integer getQtdBilh() {
        return qtdBilh;
    }

    public void setQtdBilh(Integer qtdBilh) {
        this.qtdBilh = qtdBilh;
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
    
}
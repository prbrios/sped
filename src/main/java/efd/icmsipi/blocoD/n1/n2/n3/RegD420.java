package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegD420 implements Serializable {
	private static final long serialVersionUID = -4039495283872679248L;

	@Inclui
    private final String reg = "D420";

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui
    private BigDecimal vlServ;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlImcs;

    public RegD420(Integer codMunOrig, BigDecimal vlServ, BigDecimal vlBcIcms, BigDecimal vlImcs) {
        this.codMunOrig = codMunOrig;
        this.vlServ = vlServ;
        this.vlBcIcms = vlBcIcms;
        this.vlImcs = vlImcs;
    }

    public RegD420(){}

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

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getVlImcs() {
        return vlImcs;
    }

    public void setVlImcs(BigDecimal vlImcs) {
        this.vlImcs = vlImcs;
    }
    
}
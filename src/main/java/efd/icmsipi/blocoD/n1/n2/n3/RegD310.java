package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegD310 implements Serializable {
	private static final long serialVersionUID = 5950731917999189201L;

	@Inclui
    private final String reg = "D310";

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui
    private BigDecimal vlServ;

    @Inclui
    private BigDecimal vlbcIcms;

    @Inclui
    private BigDecimal vlIcms;

    public RegD310(Integer codMunOrig, BigDecimal vlServ, BigDecimal vlbcIcms, BigDecimal vlIcms) {
        this.codMunOrig = codMunOrig;
        this.vlServ = vlServ;
        this.vlbcIcms = vlbcIcms;
        this.vlIcms = vlIcms;
    }

    public RegD310(){}

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

    public BigDecimal getVlbcIcms() {
        return vlbcIcms;
    }

    public void setVlbcIcms(BigDecimal vlbcIcms) {
        this.vlbcIcms = vlbcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }
    
}
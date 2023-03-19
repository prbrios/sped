package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegD697 implements Serializable {
	private static final long serialVersionUID = -6838428494805526302L;

	@Inclui
    private final String reg = "D697";

    @Inclui
    private String uf;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    public RegD697(String uf, BigDecimal vlBcIcms, BigDecimal vlIcms) {
        this.uf = uf;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
    }

    public RegD697(){}

    public String getReg() {
        return reg;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
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
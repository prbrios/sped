package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegE510 implements Serializable {
	private static final long serialVersionUID = 9044857799316690035L;

	@Inclui
    private final String reg = "E510";

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private String cstIpi;

    @Inclui
    private BigDecimal vlContIpi;

    @Inclui
    private BigDecimal vlBcIpi;

    @Inclui
    private BigDecimal vlIpi;

    public RegE510(Integer cfop, String cstIpi, BigDecimal vlContIpi, BigDecimal vlBcIpi, BigDecimal vlIpi) {
        this.cfop = cfop;
        this.cstIpi = cstIpi;
        this.vlContIpi = vlContIpi;
        this.vlBcIpi = vlBcIpi;
        this.vlIpi = vlIpi;
    }

    public RegE510(){}

    public String getReg() {
        return reg;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public String getCstIpi() {
        return cstIpi;
    }

    public void setCstIpi(String cstIpi) {
        this.cstIpi = cstIpi;
    }

    public BigDecimal getVlContIpi() {
        return vlContIpi;
    }

    public void setVlContIpi(BigDecimal vlContIpi) {
        this.vlContIpi = vlContIpi;
    }

    public BigDecimal getVlBcIpi() {
        return vlBcIpi;
    }

    public void setVlBcIpi(BigDecimal vlBcIpi) {
        this.vlBcIpi = vlBcIpi;
    }

    public BigDecimal getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(BigDecimal vlIpi) {
        this.vlIpi = vlIpi;
    }
    

}
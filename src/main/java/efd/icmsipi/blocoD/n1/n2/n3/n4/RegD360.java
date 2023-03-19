package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegD360 implements Serializable {
	private static final long serialVersionUID = -4792358090148195613L;

	@Inclui
    private final String reg = "D360";

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    public RegD360(BigDecimal vlPis, BigDecimal vlCofins) {
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
    }

    public RegD360(){}

    public String getReg() {
        return reg;
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
    
}
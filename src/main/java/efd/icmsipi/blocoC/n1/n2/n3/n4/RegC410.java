package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC410 implements Serializable {
	private static final long serialVersionUID = 3122951584718912667L;

	@Inclui
    private final String reg = "C410";

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    public RegC410(BigDecimal vlPis, BigDecimal vlCofins) {
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
    }

    public RegC410(){}

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
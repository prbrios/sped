package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegM350 implements Serializable {
	private static final long serialVersionUID = 7213003671744536184L;

	@Inclui
	private final String reg = "M350";

    @Inclui
    private BigDecimal vlTotFol;

    @Inclui
    private BigDecimal vlExcBc;

    @Inclui
    private BigDecimal vlTotBc;

    @Inclui
    private BigDecimal aliqPisFol;

    @Inclui
    private BigDecimal vlTotContFol;

    public RegM350(BigDecimal vlTotFol, BigDecimal vlExcBc, BigDecimal vlTotBc, BigDecimal aliqPisFol, BigDecimal vlTotContFol) {
        this.vlTotFol = vlTotFol;
        this.vlExcBc = vlExcBc;
        this.vlTotBc = vlTotBc;
        this.aliqPisFol = aliqPisFol;
        this.vlTotContFol = vlTotContFol;
    }

    public RegM350(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlTotFol() {
        return vlTotFol;
    }

    public void setVlTotFol(BigDecimal vlTotFol) {
        this.vlTotFol = vlTotFol;
    }

    public BigDecimal getVlExcBc() {
        return vlExcBc;
    }

    public void setVlExcBc(BigDecimal vlExcBc) {
        this.vlExcBc = vlExcBc;
    }

    public BigDecimal getVlTotBc() {
        return vlTotBc;
    }

    public void setVlTotBc(BigDecimal vlTotBc) {
        this.vlTotBc = vlTotBc;
    }

    public BigDecimal getAliqPisFol() {
        return aliqPisFol;
    }

    public void setAliqPisFol(BigDecimal aliqPisFol) {
        this.aliqPisFol = aliqPisFol;
    }

    public BigDecimal getVlTotContFol() {
        return vlTotContFol;
    }

    public void setVlTotContFol(BigDecimal vlTotContFol) {
        this.vlTotContFol = vlTotContFol;
    }
    
}

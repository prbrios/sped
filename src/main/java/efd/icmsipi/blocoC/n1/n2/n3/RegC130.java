package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC130 implements Serializable {
	private static final long serialVersionUID = -5710703199274393419L;

	@Inclui
    private final String reg = "C130";

    @Inclui
    private BigDecimal vlServNt;

    @Inclui
    private BigDecimal vlBcIssqn;

    @Inclui
    private BigDecimal vlIssqn;

    @Inclui
    private BigDecimal vlBcIrrf;

    @Inclui
    private BigDecimal vlIrrf;

    @Inclui
    private BigDecimal vlBcPrev;

    @Inclui
    private BigDecimal vlPrev;

    public RegC130(BigDecimal vlServNt, BigDecimal vlBcIssqn, BigDecimal vlIssqn, BigDecimal vlBcIrrf, BigDecimal vlIrrf, BigDecimal vlBcPrev, BigDecimal vlPrev) {
        this.vlServNt = vlServNt;
        this.vlBcIssqn = vlBcIssqn;
        this.vlIssqn = vlIssqn;
        this.vlBcIrrf = vlBcIrrf;
        this.vlIrrf = vlIrrf;
        this.vlBcPrev = vlBcPrev;
        this.vlPrev = vlPrev;
    }

    public RegC130(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlServNt() {
        return vlServNt;
    }

    public void setVlServNt(BigDecimal vlServNt) {
        this.vlServNt = vlServNt;
    }

    public BigDecimal getVlBcIssqn() {
        return vlBcIssqn;
    }

    public void setVlBcIssqn(BigDecimal vlBcIssqn) {
        this.vlBcIssqn = vlBcIssqn;
    }

    public BigDecimal getVlIssqn() {
        return vlIssqn;
    }

    public void setVlIssqn(BigDecimal vlIssqn) {
        this.vlIssqn = vlIssqn;
    }

    public BigDecimal getVlBcIrrf() {
        return vlBcIrrf;
    }

    public void setVlBcIrrf(BigDecimal vlBcIrrf) {
        this.vlBcIrrf = vlBcIrrf;
    }

    public BigDecimal getVlIrrf() {
        return vlIrrf;
    }

    public void setVlIrrf(BigDecimal vlIrrf) {
        this.vlIrrf = vlIrrf;
    }

    public BigDecimal getVlBcPrev() {
        return vlBcPrev;
    }

    public void setVlBcPrev(BigDecimal vlBcPrev) {
        this.vlBcPrev = vlBcPrev;
    }

    public BigDecimal getVlPrev() {
        return vlPrev;
    }

    public void setVlPrev(BigDecimal vlPrev) {
        this.vlPrev = vlPrev;
    }
    
}

package efd.contribuicoes.bloco1.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg1102 implements Serializable {
	private static final long serialVersionUID = -8670415153774807600L;

	@Inclui
	private final String reg = "1102";

    @Inclui
    private BigDecimal vlCredPisTribMi;

    @Inclui
    private BigDecimal vlCredPisNtMi;

    @Inclui
    private BigDecimal vlCredPisExp;

    public Reg1102(BigDecimal vlCredPisTribMi, BigDecimal vlCredPisNtMi, BigDecimal vlCredPisExp) {
        this.vlCredPisTribMi = vlCredPisTribMi;
        this.vlCredPisNtMi = vlCredPisNtMi;
        this.vlCredPisExp = vlCredPisExp;
    }

    public Reg1102(){ }

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlCredPisTribMi() {
        return vlCredPisTribMi;
    }

    public void setVlCredPisTribMi(BigDecimal vlCredPisTribMi) {
        this.vlCredPisTribMi = vlCredPisTribMi;
    }

    public BigDecimal getVlCredPisNtMi() {
        return vlCredPisNtMi;
    }

    public void setVlCredPisNtMi(BigDecimal vlCredPisNtMi) {
        this.vlCredPisNtMi = vlCredPisNtMi;
    }

    public BigDecimal getVlCredPisExp() {
        return vlCredPisExp;
    }

    public void setVlCredPisExp(BigDecimal vlCredPisExp) {
        this.vlCredPisExp = vlCredPisExp;
    }
    
}

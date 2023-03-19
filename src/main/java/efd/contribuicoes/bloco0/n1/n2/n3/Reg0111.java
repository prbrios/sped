package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg0111 implements Serializable {
	private static final long serialVersionUID = -2184432042969990333L;

	@Inclui
	private final String reg = "0111";

    @Inclui
    private BigDecimal recBruNcumTribMi;

    @Inclui
    private BigDecimal recBruNcumNtMi;

    @Inclui
    private BigDecimal recBruNcumExp;

    @Inclui
    private BigDecimal recBruCum;

    @Inclui
    private BigDecimal recBruTotal;

    public Reg0111(BigDecimal recBruNcumTribMi, BigDecimal recBruNcumNtMi, BigDecimal recBruNcumExp, BigDecimal recBruCum, BigDecimal recBruTotal) {
        this.recBruNcumTribMi = recBruNcumTribMi;
        this.recBruNcumNtMi = recBruNcumNtMi;
        this.recBruNcumExp = recBruNcumExp;
        this.recBruCum = recBruCum;
        this.recBruTotal = recBruTotal;
    }

    public Reg0111(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getRecBruNcumTribMi() {
        return recBruNcumTribMi;
    }

    public void setRecBruNcumTribMi(BigDecimal recBruNcumTribMi) {
        this.recBruNcumTribMi = recBruNcumTribMi;
    }

    public BigDecimal getRecBruNcumNtMi() {
        return recBruNcumNtMi;
    }

    public void setRecBruNcumNtMi(BigDecimal recBruNcumNtMi) {
        this.recBruNcumNtMi = recBruNcumNtMi;
    }

    public BigDecimal getRecBruNcumExp() {
        return recBruNcumExp;
    }

    public void setRecBruNcumExp(BigDecimal recBruNcumExp) {
        this.recBruNcumExp = recBruNcumExp;
    }

    public BigDecimal getRecBruCum() {
        return recBruCum;
    }

    public void setRecBruCum(BigDecimal recBruCum) {
        this.recBruCum = recBruCum;
    }

    public BigDecimal getRecBruTotal() {
        return recBruTotal;
    }

    public void setRecBruTotal(BigDecimal recBruTotal) {
        this.recBruTotal = recBruTotal;
    }
    
}

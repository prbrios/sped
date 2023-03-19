package efd.contribuicoes.bloco1.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg1502 implements Serializable {
	private static final long serialVersionUID = 2811756418690204954L;

	@Inclui
	private final String reg = "1502";

    @Inclui
    private BigDecimal vlCredCofinsTribMi;

    @Inclui
    private BigDecimal vlCredCofinsNtMi;

    @Inclui
    private BigDecimal vlCredCofinsExp;

    public Reg1502(BigDecimal vlCredCofinsTribMi, BigDecimal vlCredCofinsNtMi, BigDecimal vlCredCofinsExp) {
        this.vlCredCofinsTribMi = vlCredCofinsTribMi;
        this.vlCredCofinsNtMi = vlCredCofinsNtMi;
        this.vlCredCofinsExp = vlCredCofinsExp;
    }

    public Reg1502(){ }

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlCredCofinsTribMi() {
        return vlCredCofinsTribMi;
    }

    public void setVlCredCofinsTribMi(BigDecimal vlCredCofinsTribMi) {
        this.vlCredCofinsTribMi = vlCredCofinsTribMi;
    }

    public BigDecimal getVlCredCofinsNtMi() {
        return vlCredCofinsNtMi;
    }

    public void setVlCredCofinsNtMi(BigDecimal vlCredCofinsNtMi) {
        this.vlCredCofinsNtMi = vlCredCofinsNtMi;
    }

    public BigDecimal getVlCredCofinsExp() {
        return vlCredCofinsExp;
    }

    public void setVlCredCofinsExp(BigDecimal vlCredCofinsExp) {
        this.vlCredCofinsExp = vlCredCofinsExp;
    }
    
}

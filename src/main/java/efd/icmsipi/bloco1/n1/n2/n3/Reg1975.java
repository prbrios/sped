package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg1975 implements Serializable {
	private static final long serialVersionUID = 5326597734921825667L;

	@Inclui
    private final String reg = "1975";

    @Inclui
    private BigDecimal aliqImpBase;

    @Inclui
    private BigDecimal g310;

    @Inclui
    private BigDecimal g311;

    @Inclui
    private BigDecimal g312;

    public Reg1975(BigDecimal aliqImpBase, BigDecimal g310, BigDecimal g311, BigDecimal g312) {
        this.aliqImpBase = aliqImpBase;
        this.g310 = g310;
        this.g311 = g311;
        this.g312 = g312;
    }

    public Reg1975(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getAliqImpBase() {
        return aliqImpBase;
    }

    public void setAliqImpBase(BigDecimal aliqImpBase) {
        this.aliqImpBase = aliqImpBase;
    }

    public BigDecimal getG310() {
        return g310;
    }

    public void setG310(BigDecimal g310) {
        this.g310 = g310;
    }

    public BigDecimal getG311() {
        return g311;
    }

    public void setG311(BigDecimal g311) {
        this.g311 = g311;
    }

    public BigDecimal getG312() {
        return g312;
    }

    public void setG312(BigDecimal g312) {
        this.g312 = g312;
    }
    

}
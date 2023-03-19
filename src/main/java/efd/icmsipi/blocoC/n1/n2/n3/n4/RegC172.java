package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC172 implements Serializable {
	private static final long serialVersionUID = 242777204200672992L;

	@Inclui
    private final String reg = "C172";

    @Inclui
    private BigDecimal vlBcIssqn;

    @Inclui
    private BigDecimal aliqIssqn;

    @Inclui
    private BigDecimal vlIssqn;

    public RegC172(BigDecimal vlBcIssqn, BigDecimal aliqIssqn, BigDecimal vlIssqn) {
        this.vlBcIssqn = vlBcIssqn;
        this.aliqIssqn = aliqIssqn;
        this.vlIssqn = vlIssqn;
    }

    public RegC172(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlBcIssqn() {
        return vlBcIssqn;
    }

    public void setVlBcIssqn(BigDecimal vlBcIssqn) {
        this.vlBcIssqn = vlBcIssqn;
    }

    public BigDecimal getAliqIssqn() {
        return aliqIssqn;
    }

    public void setAliqIssqn(BigDecimal aliqIssqn) {
        this.aliqIssqn = aliqIssqn;
    }

    public BigDecimal getVlIssqn() {
        return vlIssqn;
    }

    public void setVlIssqn(BigDecimal vlIssqn) {
        this.vlIssqn = vlIssqn;
    }
    
}

package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
public class RegC172 implements Serializable {
	private static final long serialVersionUID = 242777204200672992L;

	@Getter @Inclui
    private final String reg = "C172";

    @Getter @Setter @Inclui
    private BigDecimal vlBcIssqn;

    @Getter @Setter @Inclui
    private BigDecimal aliqIssqn;

    @Getter @Setter @Inclui
    private BigDecimal vlIssqn;

    public RegC172(BigDecimal vlBcIssqn, BigDecimal aliqIssqn, BigDecimal vlIssqn) {
        this.vlBcIssqn = vlBcIssqn;
        this.aliqIssqn = aliqIssqn;
        this.vlIssqn = vlIssqn;
    }

    public RegC172(){}
}

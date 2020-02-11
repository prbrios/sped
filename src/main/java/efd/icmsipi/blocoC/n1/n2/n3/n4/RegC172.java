package efd.icmsipi.blocoC.n1.n2.n3.n4;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegC172 {

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

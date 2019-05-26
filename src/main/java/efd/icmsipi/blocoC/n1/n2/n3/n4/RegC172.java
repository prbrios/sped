package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class RegC172 {

    @Inclui
    private final String reg = "C172";

    @Inclui
    private BigDecimal vlBcIssqn;

    @Inclui
    private BigDecimal aliqIssqn;

    @Inclui
    private BigDecimal vlIssqn;

}

package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class RegC130 {

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
}

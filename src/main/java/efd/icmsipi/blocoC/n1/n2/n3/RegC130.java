package efd.icmsipi.blocoC.n1.n2.n3;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegC130 {

    @Getter @Inclui
    private final String reg = "C130";

    @Getter @Setter @Inclui
    private BigDecimal vlServNt;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIssqn;

    @Getter @Setter @Inclui
    private BigDecimal vlIssqn;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIrrf;

    @Getter @Setter @Inclui
    private BigDecimal vlIrrf;

    @Getter @Setter @Inclui
    private BigDecimal vlBcPrev;

    @Getter @Setter @Inclui
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

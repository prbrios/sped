package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegB440 {

    @Inclui
    private final String reg = "B440";

    @Inclui
    private Integer indOper;

    @Inclui
    private String codPart;

    @Inclui
    private BigDecimal vlContRt;

    @Inclui
    private BigDecimal vlBcIssRt;

    @Inclui
    private BigDecimal vlIssRt;

}

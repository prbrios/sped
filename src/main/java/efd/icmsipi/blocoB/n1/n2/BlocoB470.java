package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BlocoB470 {

    @Inclui
    private final String reg = "B470";

    @Inclui
    private BigDecimal vlCont;

    @Inclui
    private BigDecimal vlMatTerc;

    @Inclui
    private BigDecimal vlMatProp;

    @Inclui
    private BigDecimal vlSub;

    @Inclui
    private BigDecimal vlIsnt;

    @Inclui
    private BigDecimal vlDedBc;

    @Inclui
    private BigDecimal vlBcIss;

    @Inclui
    private BigDecimal vlBcIssRt;

    @Inclui
    private BigDecimal vlIss;

    @Inclui
    private BigDecimal vlIssRt;

    @Inclui
    private BigDecimal vlDed;

    @Inclui
    private BigDecimal vlIssRec;

    @Inclui
    private BigDecimal vlIssSt;

    @Inclui
    private BigDecimal vlIssRecUni;

}

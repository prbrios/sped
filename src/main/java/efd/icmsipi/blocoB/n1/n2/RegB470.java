package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegB470 {

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

    public RegB470(BigDecimal vlCont, BigDecimal vlMatTerc, BigDecimal vlMatProp, BigDecimal vlSub, BigDecimal vlIsnt, BigDecimal vlDedBc, BigDecimal vlBcIss, BigDecimal vlBcIssRt, BigDecimal vlIss, BigDecimal vlIssRt, BigDecimal vlDed, BigDecimal vlIssRec, BigDecimal vlIssSt, BigDecimal vlIssRecUni) {
        this.vlCont = vlCont;
        this.vlMatTerc = vlMatTerc;
        this.vlMatProp = vlMatProp;
        this.vlSub = vlSub;
        this.vlIsnt = vlIsnt;
        this.vlDedBc = vlDedBc;
        this.vlBcIss = vlBcIss;
        this.vlBcIssRt = vlBcIssRt;
        this.vlIss = vlIss;
        this.vlIssRt = vlIssRt;
        this.vlDed = vlDed;
        this.vlIssRec = vlIssRec;
        this.vlIssSt = vlIssSt;
        this.vlIssRecUni = vlIssRecUni;
    }

    public RegB470(){}
}

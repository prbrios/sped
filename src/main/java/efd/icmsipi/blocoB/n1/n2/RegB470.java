package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegB470 {

    @Getter @Inclui
    private final String reg = "B470";

    @Getter @Setter @Inclui
    private BigDecimal vlCont;

    @Getter @Setter @Inclui
    private BigDecimal vlMatTerc;

    @Getter @Setter @Inclui
    private BigDecimal vlMatProp;

    @Getter @Setter @Inclui
    private BigDecimal vlSub;

    @Getter @Setter @Inclui
    private BigDecimal vlIsnt;

    @Getter @Setter @Inclui
    private BigDecimal vlDedBc;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIss;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIssRt;

    @Getter @Setter @Inclui
    private BigDecimal vlIss;

    @Getter @Setter @Inclui
    private BigDecimal vlIssRt;

    @Getter @Setter @Inclui
    private BigDecimal vlDed;

    @Getter @Setter @Inclui
    private BigDecimal vlIssRec;

    @Getter @Setter @Inclui
    private BigDecimal vlIssSt;

    @Getter @Setter @Inclui
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

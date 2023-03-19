package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegB470 implements Serializable {
	private static final long serialVersionUID = -3652729509394044770L;

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

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlCont() {
        return vlCont;
    }

    public void setVlCont(BigDecimal vlCont) {
        this.vlCont = vlCont;
    }

    public BigDecimal getVlMatTerc() {
        return vlMatTerc;
    }

    public void setVlMatTerc(BigDecimal vlMatTerc) {
        this.vlMatTerc = vlMatTerc;
    }

    public BigDecimal getVlMatProp() {
        return vlMatProp;
    }

    public void setVlMatProp(BigDecimal vlMatProp) {
        this.vlMatProp = vlMatProp;
    }

    public BigDecimal getVlSub() {
        return vlSub;
    }

    public void setVlSub(BigDecimal vlSub) {
        this.vlSub = vlSub;
    }

    public BigDecimal getVlIsnt() {
        return vlIsnt;
    }

    public void setVlIsnt(BigDecimal vlIsnt) {
        this.vlIsnt = vlIsnt;
    }

    public BigDecimal getVlDedBc() {
        return vlDedBc;
    }

    public void setVlDedBc(BigDecimal vlDedBc) {
        this.vlDedBc = vlDedBc;
    }

    public BigDecimal getVlBcIss() {
        return vlBcIss;
    }

    public void setVlBcIss(BigDecimal vlBcIss) {
        this.vlBcIss = vlBcIss;
    }

    public BigDecimal getVlBcIssRt() {
        return vlBcIssRt;
    }

    public void setVlBcIssRt(BigDecimal vlBcIssRt) {
        this.vlBcIssRt = vlBcIssRt;
    }

    public BigDecimal getVlIss() {
        return vlIss;
    }

    public void setVlIss(BigDecimal vlIss) {
        this.vlIss = vlIss;
    }

    public BigDecimal getVlIssRt() {
        return vlIssRt;
    }

    public void setVlIssRt(BigDecimal vlIssRt) {
        this.vlIssRt = vlIssRt;
    }

    public BigDecimal getVlDed() {
        return vlDed;
    }

    public void setVlDed(BigDecimal vlDed) {
        this.vlDed = vlDed;
    }

    public BigDecimal getVlIssRec() {
        return vlIssRec;
    }

    public void setVlIssRec(BigDecimal vlIssRec) {
        this.vlIssRec = vlIssRec;
    }

    public BigDecimal getVlIssSt() {
        return vlIssSt;
    }

    public void setVlIssSt(BigDecimal vlIssSt) {
        this.vlIssSt = vlIssSt;
    }

    public BigDecimal getVlIssRecUni() {
        return vlIssRecUni;
    }

    public void setVlIssRecUni(BigDecimal vlIssRecUni) {
        this.vlIssRecUni = vlIssRecUni;
    }
    
}

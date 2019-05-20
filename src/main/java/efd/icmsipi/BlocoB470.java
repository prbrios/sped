package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BlocoB470 {

    private final String reg = "B470";
    private BigDecimal vlCont;
    private BigDecimal vlMatTerc;
    private BigDecimal vlMatProp;
    private BigDecimal vlSub;
    private BigDecimal vlIsnt;
    private BigDecimal vlDedBc;
    private BigDecimal vlBcIss;
    private BigDecimal vlBcIssRt;
    private BigDecimal vlIss;
    private BigDecimal vlIssRt;
    private BigDecimal vlDed;
    private BigDecimal vlIssRec;
    private BigDecimal vlIssSt;
    private BigDecimal vlIssRecUni;

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

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.vlCont != null ? Parsers.formataNumero(this.vlCont, 2) : null);
        arr.add(this.vlMatTerc != null ? Parsers.formataNumero(this.vlMatTerc, 2) : null);
        arr.add(this.vlMatProp != null ? Parsers.formataNumero(this.vlMatProp, 2) : null);
        arr.add(this.vlSub != null ? Parsers.formataNumero(this.vlSub, 2) : null);
        arr.add(this.vlIsnt != null ? Parsers.formataNumero(this.vlIsnt, 2) : null);
        arr.add(this.vlDedBc != null ? Parsers.formataNumero(this.vlDedBc, 2) : null);
        arr.add(this.vlBcIss != null ? Parsers.formataNumero(this.vlBcIss, 2) : null);
        arr.add(this.vlBcIssRt != null ? Parsers.formataNumero(this.vlBcIssRt, 2) : null);
        arr.add(this.vlIss != null ? Parsers.formataNumero(this.vlIss, 2) : null);
        arr.add(this.vlIssRt != null ? Parsers.formataNumero(this.vlIssRt, 2) : null);
        arr.add(this.vlDed != null ? Parsers.formataNumero(this.vlDed, 2) : null);
        arr.add(this.vlIssRec != null ? Parsers.formataNumero(this.vlIssRec, 2) : null);
        arr.add(this.vlIssSt != null ? Parsers.formataNumero(this.vlIssSt, 2) : null);
        arr.add(this.vlIssRecUni != null ? Parsers.formataNumero(this.vlIssRecUni, 2) : null);

        return Parsers.converteBlocoEmString(arr);

    }

}

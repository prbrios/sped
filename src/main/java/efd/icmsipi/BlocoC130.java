package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BlocoC130 {

    private final String reg = "C130";
    private BigDecimal vlServNt;
    private BigDecimal vlBcIssqn;
    private BigDecimal vlIssqn;
    private BigDecimal vlBcIrrf;
    private BigDecimal vlIrrf;
    private BigDecimal vlBcPrev;
    private BigDecimal vlPrev;

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlServNt() {
        return vlServNt;
    }

    public void setVlServNt(BigDecimal vlServNt) {
        this.vlServNt = vlServNt;
    }

    public BigDecimal getVlBcIssqn() {
        return vlBcIssqn;
    }

    public void setVlBcIssqn(BigDecimal vlBcIssqn) {
        this.vlBcIssqn = vlBcIssqn;
    }

    public BigDecimal getVlIssqn() {
        return vlIssqn;
    }

    public void setVlIssqn(BigDecimal vlIssqn) {
        this.vlIssqn = vlIssqn;
    }

    public BigDecimal getVlBcIrrf() {
        return vlBcIrrf;
    }

    public void setVlBcIrrf(BigDecimal vlBcIrrf) {
        this.vlBcIrrf = vlBcIrrf;
    }

    public BigDecimal getVlIrrf() {
        return vlIrrf;
    }

    public void setVlIrrf(BigDecimal vlIrrf) {
        this.vlIrrf = vlIrrf;
    }

    public BigDecimal getVlBcPrev() {
        return vlBcPrev;
    }

    public void setVlBcPrev(BigDecimal vlBcPrev) {
        this.vlBcPrev = vlBcPrev;
    }

    public BigDecimal getVlPrev() {
        return vlPrev;
    }

    public void setVlPrev(BigDecimal vlPrev) {
        this.vlPrev = vlPrev;
    }

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.vlServNt != null ? Parsers.formataNumero(this.vlServNt, 2) : null);
        arr.add(this.vlBcIssqn != null ? Parsers.formataNumero(this.vlBcIssqn, 2) : null);
        arr.add(this.vlIssqn != null ? Parsers.formataNumero(this.vlIssqn, 2) : null);
        arr.add(this.vlBcIrrf != null ? Parsers.formataNumero(this.vlBcIrrf, 2) : null);
        arr.add(this.vlIrrf != null ? Parsers.formataNumero(this.vlIrrf, 2) : null);
        arr.add(this.vlBcPrev != null ? Parsers.formataNumero(this.vlBcPrev, 2) : null);
        arr.add(this.vlPrev != null ? Parsers.formataNumero(this.vlPrev, 2) : null);

        return Parsers.converteBlocoEmString(arr);

    }

}

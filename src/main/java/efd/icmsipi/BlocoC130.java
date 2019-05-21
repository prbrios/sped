package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.math.BigDecimal;

public class BlocoC130 {

    @Inclui private final String reg = "C130";
    @Inclui private BigDecimal vlServNt;
    @Inclui private BigDecimal vlBcIssqn;
    @Inclui private BigDecimal vlIssqn;
    @Inclui private BigDecimal vlBcIrrf;
    @Inclui private BigDecimal vlIrrf;
    @Inclui private BigDecimal vlBcPrev;
    @Inclui private BigDecimal vlPrev;

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
        return Parsers.converteBlocoEmString(this);
    }

}

package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.math.BigDecimal;

public class BlocoB025 {

    @Inclui private final String reg = "B025";
    @Inclui private BigDecimal vlContP;
    @Inclui private BigDecimal vlBcIssP;
    @Inclui private BigDecimal aliqIss;
    @Inclui private BigDecimal vlIssP;
    @Inclui private BigDecimal vlIsntIssP;
    @Inclui private String codServ;

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlContP() {
        return vlContP;
    }

    public void setVlContP(BigDecimal vlContP) {
        this.vlContP = vlContP;
    }

    public BigDecimal getVlBcIssP() {
        return vlBcIssP;
    }

    public void setVlBcIssP(BigDecimal vlBcIssP) {
        this.vlBcIssP = vlBcIssP;
    }

    public BigDecimal getAliqIss() {
        return aliqIss;
    }

    public void setAliqIss(BigDecimal aliqIss) {
        this.aliqIss = aliqIss;
    }

    public BigDecimal getVlIssP() {
        return vlIssP;
    }

    public void setVlIssP(BigDecimal vlIssP) {
        this.vlIssP = vlIssP;
    }

    public BigDecimal getVlIsntIssP() {
        return vlIsntIssP;
    }

    public void setVlIsntIssP(BigDecimal vlIsntIssP) {
        this.vlIsntIssP = vlIsntIssP;
    }

    public String getCodServ() {
        return codServ;
    }

    public void setCodServ(String codServ) {
        this.codServ = codServ;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}

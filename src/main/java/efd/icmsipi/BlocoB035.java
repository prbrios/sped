package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BlocoB035 {

    private final String reg = "B035";
    private BigDecimal vlContP;
    private BigDecimal vlBcIssP;
    private BigDecimal aliqIss;
    private BigDecimal vlIssP;
    private BigDecimal vlIsntIssP;
    private String codServ;

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

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.vlContP != null ? Parsers.formataNumero(this.vlContP, 2) : null);
        arr.add(this.vlBcIssP != null ? Parsers.formataNumero(this.vlBcIssP, 2) : null);
        arr.add(this.aliqIss != null ? Parsers.formataNumero(this.aliqIss, 2) : null);
        arr.add(this.vlIssP != null ? Parsers.formataNumero(this.vlIssP, 2) : null);
        arr.add(this.vlIsntIssP != null ? Parsers.formataNumero(this.vlIsntIssP, 2) : null);
        arr.add(this.codServ);

        return Parsers.converteBlocoEmString(arr);

    }
}

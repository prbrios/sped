package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BlocoB420 {

    private final String reg = "B420";
    private BigDecimal vlCont;
    private BigDecimal vlBcIss;
    private BigDecimal aliqIss;
    private BigDecimal vlIsntIss;
    private BigDecimal vlIss;
    private String codServ;

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlCont() {
        return vlCont;
    }

    public void setVlCont(BigDecimal vlCont) {
        this.vlCont = vlCont;
    }

    public BigDecimal getVlBcIss() {
        return vlBcIss;
    }

    public void setVlBcIss(BigDecimal vlBcIss) {
        this.vlBcIss = vlBcIss;
    }

    public BigDecimal getAliqIss() {
        return aliqIss;
    }

    public void setAliqIss(BigDecimal aliqIss) {
        this.aliqIss = aliqIss;
    }

    public BigDecimal getVlIsntIss() {
        return vlIsntIss;
    }

    public void setVlIsntIss(BigDecimal vlIsntIss) {
        this.vlIsntIss = vlIsntIss;
    }

    public BigDecimal getVlIss() {
        return vlIss;
    }

    public void setVlIss(BigDecimal vlIss) {
        this.vlIss = vlIss;
    }

    public String getCodServ() {
        return codServ;
    }

    public void setCodServ(String codServ) {
        this.codServ = codServ;
    }

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.vlCont != null ? Parsers.formataNumero(this.vlCont, 2) : null);
        arr.add(this.vlBcIss != null ? Parsers.formataNumero(this.vlBcIss, 2) : null);
        arr.add(this.aliqIss != null ? Parsers.formataNumero(this.aliqIss, 2) : null);
        arr.add(this.vlIsntIss != null ? Parsers.formataNumero(this.vlIsntIss, 2) : null);
        arr.add(this.vlIss != null ? Parsers.formataNumero(this.vlIss, 2) : null);
        arr.add(this.codServ);

        return Parsers.converteBlocoEmString(arr);

    }
}

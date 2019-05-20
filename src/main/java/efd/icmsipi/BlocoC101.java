package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BlocoC101 {

    private final String reg = "C101";
    private BigDecimal vlFcpUfDest;
    private BigDecimal vlIcmsUfDest;
    private BigDecimal vlIcmsUfRem;

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlFcpUfDest() {
        return vlFcpUfDest;
    }

    public void setVlFcpUfDest(BigDecimal vlFcpUfDest) {
        this.vlFcpUfDest = vlFcpUfDest;
    }

    public BigDecimal getVlIcmsUfDest() {
        return vlIcmsUfDest;
    }

    public void setVlIcmsUfDest(BigDecimal vlIcmsUfDest) {
        this.vlIcmsUfDest = vlIcmsUfDest;
    }

    public BigDecimal getVlIcmsUfRem() {
        return vlIcmsUfRem;
    }

    public void setVlIcmsUfRem(BigDecimal vlIcmsUfRem) {
        this.vlIcmsUfRem = vlIcmsUfRem;
    }

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.vlFcpUfDest != null ? Parsers.formataNumero(this.vlFcpUfDest, 2) : null);
        arr.add(this.vlIcmsUfDest != null ? Parsers.formataNumero(this.vlIcmsUfDest, 2) : null);
        arr.add(this.vlIcmsUfRem != null ? Parsers.formataNumero(this.vlIcmsUfRem, 2) : null);

        return Parsers.converteBlocoEmString(arr);

    }

}

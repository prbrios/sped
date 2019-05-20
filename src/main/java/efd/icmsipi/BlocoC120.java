package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BlocoC120 {

    private final String reg = "C120";
    private String codDocImp;
    private String numDocImp;
    private BigDecimal pisImp;
    private BigDecimal cofinsImp;
    private String numAcdraw;

    public String getReg() {
        return reg;
    }

    public String getCodDocImp() {
        return codDocImp;
    }

    public void setCodDocImp(String codDocImp) {
        this.codDocImp = codDocImp;
    }

    public String getNumDocImp() {
        return numDocImp;
    }

    public void setNumDocImp(String numDocImp) {
        this.numDocImp = numDocImp;
    }

    public BigDecimal getPisImp() {
        return pisImp;
    }

    public void setPisImp(BigDecimal pisImp) {
        this.pisImp = pisImp;
    }

    public BigDecimal getCofinsImp() {
        return cofinsImp;
    }

    public void setCofinsImp(BigDecimal cofinsImp) {
        this.cofinsImp = cofinsImp;
    }

    public String getNumAcdraw() {
        return numAcdraw;
    }

    public void setNumAcdraw(String numAcdraw) {
        this.numAcdraw = numAcdraw;
    }

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.codDocImp);
        arr.add(this.numDocImp);
        arr.add(this.pisImp != null ? Parsers.formataNumero(this.pisImp, 2) : null);
        arr.add(this.cofinsImp != null ? Parsers.formataNumero(this.cofinsImp, 2) : null);
        arr.add(this.numAcdraw);

        return Parsers.converteBlocoEmString(arr);

    }
}

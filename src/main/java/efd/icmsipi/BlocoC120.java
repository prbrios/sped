package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.math.BigDecimal;

public class BlocoC120 {

    @Inclui private final String reg = "C120";
    @Inclui private String codDocImp;
    @Inclui private String numDocImp;
    @Inclui private BigDecimal pisImp;
    @Inclui private BigDecimal cofinsImp;
    @Inclui private String numAcdraw;

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
        return Parsers.converteBlocoEmString(this);
    }
}

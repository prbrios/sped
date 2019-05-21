package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.math.BigDecimal;

public class BlocoB460 {

    @Inclui private final String reg = "B460";
    @Inclui private String indDed;
    @Inclui private BigDecimal vlDed;
    @Inclui private String numProc;
    @Inclui private String indProc;
    @Inclui private String proc;
    @Inclui private String codInfObs;
    @Inclui private String indObr;

    public String getReg() {
        return reg;
    }

    public String getIndDed() {
        return indDed;
    }

    public void setIndDed(String indDed) {
        this.indDed = indDed;
    }

    public BigDecimal getVlDed() {
        return vlDed;
    }

    public void setVlDed(BigDecimal vlDed) {
        this.vlDed = vlDed;
    }

    public String getNumProc() {
        return numProc;
    }

    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }

    public String getIndProc() {
        return indProc;
    }

    public void setIndProc(String indProc) {
        this.indProc = indProc;
    }

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public String getCodInfObs() {
        return codInfObs;
    }

    public void setCodInfObs(String codInfObs) {
        this.codInfObs = codInfObs;
    }

    public String getIndObr() {
        return indObr;
    }

    public void setIndObr(String indObr) {
        this.indObr = indObr;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}

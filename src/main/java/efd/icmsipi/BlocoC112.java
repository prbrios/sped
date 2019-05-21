package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BlocoC112 {

    @Inclui private final String reg = "C112";
    @Inclui private String codDa;
    @Inclui private String uf;
    @Inclui private String numDa;
    @Inclui private String codAut;
    @Inclui private BigDecimal vlDa;
    @Inclui private LocalDate dtVcto;
    @Inclui private LocalDate dtPgto;

    public String getReg() {
        return reg;
    }

    public String getCodDa() {
        return codDa;
    }

    public void setCodDa(String codDa) {
        this.codDa = codDa;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNumDa() {
        return numDa;
    }

    public void setNumDa(String numDa) {
        this.numDa = numDa;
    }

    public String getCodAut() {
        return codAut;
    }

    public void setCodAut(String codAut) {
        this.codAut = codAut;
    }

    public BigDecimal getVlDa() {
        return vlDa;
    }

    public void setVlDa(BigDecimal vlDa) {
        this.vlDa = vlDa;
    }

    public LocalDate getDtVcto() {
        return dtVcto;
    }

    public void setDtVcto(LocalDate dtVcto) {
        this.dtVcto = dtVcto;
    }

    public LocalDate getDtPgto() {
        return dtPgto;
    }

    public void setDtPgto(LocalDate dtPgto) {
        this.dtPgto = dtPgto;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}

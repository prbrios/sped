package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BlocoC141 {

    @Inclui private final String reg = "C141";
    @Inclui private Integer numParc;
    @Inclui private LocalDate dtVcto;
    @Inclui private BigDecimal vlParc;

    public String getReg() {
        return reg;
    }

    public Integer getNumParc() {
        return numParc;
    }

    public void setNumParc(Integer numParc) {
        this.numParc = numParc;
    }

    public LocalDate getDtVcto() {
        return dtVcto;
    }

    public void setDtVcto(LocalDate dtVcto) {
        this.dtVcto = dtVcto;
    }

    public BigDecimal getVlParc() {
        return vlParc;
    }

    public void setVlParc(BigDecimal vlParc) {
        this.vlParc = vlParc;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}

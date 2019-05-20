package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class BlocoC141 {

    private final String reg = "C141";
    private Integer numParc;
    private LocalDate dtVcto;
    private BigDecimal vlParc;

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

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.numParc);
        arr.add(this.dtVcto != null ? Parsers.formataData(this.dtVcto, "ddMMyyyy") : null);
        arr.add(this.vlParc != null ? Parsers.formataNumero(this.vlParc, 2) : null);

        return Parsers.converteBlocoEmString(arr);

    }

}

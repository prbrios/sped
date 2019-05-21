package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.math.BigDecimal;

public class BlocoC140 {

    @Inclui private final String reg = "C140";
    @Inclui private String indEmit;
    @Inclui private String indTit;
    @Inclui private String descTit;
    @Inclui private String numTit;
    @Inclui private Integer qtdParc;
    @Inclui private BigDecimal vlTit;

    public String getReg() {
        return reg;
    }

    public String getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }

    public String getIndTit() {
        return indTit;
    }

    public void setIndTit(String indTit) {
        this.indTit = indTit;
    }

    public String getDescTit() {
        return descTit;
    }

    public void setDescTit(String descTit) {
        this.descTit = descTit;
    }

    public String getNumTit() {
        return numTit;
    }

    public void setNumTit(String numTit) {
        this.numTit = numTit;
    }

    public Integer getQtdParc() {
        return qtdParc;
    }

    public void setQtdParc(Integer qtdParc) {
        this.qtdParc = qtdParc;
    }

    public BigDecimal getVlTit() {
        return vlTit;
    }

    public void setVlTit(BigDecimal vlTit) {
        this.vlTit = vlTit;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }
}

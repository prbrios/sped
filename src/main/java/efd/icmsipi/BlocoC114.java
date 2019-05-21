package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.time.LocalDate;

public class BlocoC114 {

    @Inclui private final String reg = "C114";
    @Inclui private String codMod;
    @Inclui private String ecfFab;
    @Inclui private Integer ecfCx;
    @Inclui private Integer numDoc;
    @Inclui private LocalDate dtDoc;

    public String getReg() {
        return reg;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getEcfFab() {
        return ecfFab;
    }

    public void setEcfFab(String ecfFab) {
        this.ecfFab = ecfFab;
    }

    public Integer getEcfCx() {
        return ecfCx;
    }

    public void setEcfCx(Integer ecfCx) {
        this.ecfCx = ecfCx;
    }

    public Integer getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Integer numDoc) {
        this.numDoc = numDoc;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}

package efd.icmsipi;

import efd.Parsers;

import java.time.LocalDate;
import java.util.ArrayList;

public class BlocoC114 {

    private final String reg = "C114";
    private String codMod;
    private String ecfFab;
    private Integer ecfCx;
    private Integer numDoc;
    private LocalDate dtDoc;

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

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.codMod);
        arr.add(this.ecfFab);
        arr.add(this.ecfCx);
        arr.add(this.numDoc);
        arr.add(this.dtDoc != null ? Parsers.formataData(this.dtDoc, "ddMMyyyy") : null);

        return Parsers.converteBlocoEmString(arr);

    }

}

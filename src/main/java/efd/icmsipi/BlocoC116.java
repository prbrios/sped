package efd.icmsipi;

import efd.Parsers;

import java.time.LocalDate;
import java.util.ArrayList;

public class BlocoC116 {

    private final String reg = "C116";
    private String codMod;
    private String nrSat;
    private String chvNfe;
    private String numCfe;
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

    public String getNrSat() {
        return nrSat;
    }

    public void setNrSat(String nrSat) {
        this.nrSat = nrSat;
    }

    public String getChvNfe() {
        return chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }

    public String getNumCfe() {
        return numCfe;
    }

    public void setNumCfe(String numCfe) {
        this.numCfe = numCfe;
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
        arr.add(this.nrSat);
        arr.add(this.chvNfe);
        arr.add(this.numCfe);
        arr.add(this.dtDoc != null ? Parsers.formataData(this.dtDoc, "ddMMyyyy") : null);

        return Parsers.converteBlocoEmString(arr);

    }

}

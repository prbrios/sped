package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.time.LocalDate;

public class BlocoC116 {

    @Inclui private final String reg = "C116";
    @Inclui private String codMod;
    @Inclui private String nrSat;
    @Inclui private String chvNfe;
    @Inclui private String numCfe;
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
        return Parsers.converteBlocoEmString(this);
    }

}

package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.time.LocalDate;

public class Bloco0205 {

    @Inclui private final String reg = "0205";
    @Inclui private String descrAntItem;
    @Inclui private LocalDate dtIni;
    @Inclui private LocalDate dtFim;
    @Inclui private String codAntItem;

    public String getReg() {
        return reg;
    }

    public String getDescrAntItem() {
        return descrAntItem;
    }

    public void setDescrAntItem(String descrAntItem) {
        this.descrAntItem = descrAntItem;
    }

    public LocalDate getDtIni() {
        return dtIni;
    }

    public void setDtIni(LocalDate dtIni) {
        this.dtIni = dtIni;
    }

    public LocalDate getDtFim() {
        return dtFim;
    }

    public void setDtFim(LocalDate dtFim) {
        this.dtFim = dtFim;
    }

    public String getCodAntItem() {
        return codAntItem;
    }

    public void setCodAntItem(String codAntItem) {
        this.codAntItem = codAntItem;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}

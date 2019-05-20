package efd.icmsipi;

import efd.Parsers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bloco0205 {

    private final String reg = "0205";
    private String descrAntItem;
    private LocalDate dtIni;
    private LocalDate dtFim;
    private String codAntItem;

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

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.descrAntItem);
        arr.add(this.dtIni != null ? Parsers.formataData(this.dtIni, "ddMMyyyy") : null);
        arr.add(this.dtFim != null ? Parsers.formataData(this.dtFim, "ddMMyyyy") : null);
        arr.add(this.codAntItem);

        return Parsers.converteBlocoEmString(arr);

    }
}

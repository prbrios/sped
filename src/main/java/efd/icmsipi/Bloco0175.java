package efd.icmsipi;

import efd.Parsers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bloco0175 {

    private final String reg = "0175";
    private LocalDate dtAlt;
    private String nrCampo;
    private String contAnt;

    public String getReg() {
        return reg;
    }

    public LocalDate getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(LocalDate dtAlt) {
        this.dtAlt = dtAlt;
    }

    public String getNrCampo() {
        return nrCampo;
    }

    public void setNrCampo(String nrCampo) {
        this.nrCampo = nrCampo;
    }

    public String getContAnt() {
        return contAnt;
    }

    public void setContAnt(String contAnt) {
        this.contAnt = contAnt;
    }

    @Override
    public String toString(){

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.dtAlt != null ? Parsers.formataData(this.dtAlt, "ddMMyyyy") : null);
        arr.add(this.nrCampo);
        arr.add(this.contAnt);

        return Parsers.converteBlocoEmString(arr);

    }
}

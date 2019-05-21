package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.time.LocalDate;

public class Bloco0175 {

    @Inclui private final String reg = "0175";
    @Inclui private LocalDate dtAlt;
    @Inclui private String nrCampo;
    @Inclui private String contAnt;

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
        return Parsers.converteBlocoEmString(this);
    }

}

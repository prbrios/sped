package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class Bloco0460 {

    @Inclui private final String reg = "0460";
    @Inclui private String codObs;
    @Inclui private String txt;

    public String getReg() {
        return reg;
    }

    public String getCodObs() {
        return codObs;
    }

    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}

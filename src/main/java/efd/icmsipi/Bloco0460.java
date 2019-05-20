package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;
import java.util.List;

public class Bloco0460 {

    private final String reg = "0460";
    private String codObs;
    private String txt;

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

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.codObs);
        arr.add(this.txt);

        return Parsers.converteBlocoEmString(arr);

    }

}

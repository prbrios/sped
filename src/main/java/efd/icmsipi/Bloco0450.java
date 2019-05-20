package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;
import java.util.List;

public class Bloco0450 {

    private final String reg = "0450";
    private String codInf;
    private String txt;

    public String getReg() {
        return reg;
    }

    public String getCodInf() {
        return codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
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
        arr.add(this.codInf);
        arr.add(this.txt);

        return Parsers.converteBlocoEmString(arr);

    }

}

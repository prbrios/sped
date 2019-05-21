package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class Bloco0450 {

    @Inclui private final String reg = "0450";
    @Inclui private String codInf;
    @Inclui private String txt;

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
        return Parsers.converteBlocoEmString(this);
    }

}

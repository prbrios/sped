package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class BlocoC001 {

    @Inclui private final String reg = "C001";
    @Inclui private String indMov;

    public String getReg() {
        return reg;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }
}

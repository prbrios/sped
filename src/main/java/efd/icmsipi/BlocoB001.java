package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class BlocoB001 {

    @Inclui private final String reg = "B001";
    @Inclui private String indDad;

    public String getReg() {
        return reg;
    }

    public String getIndDad() {
        return indDad;
    }

    public void setIndDad(String indDad) {
        this.indDad = indDad;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}

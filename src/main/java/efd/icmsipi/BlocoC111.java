package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class BlocoC111 {

    @Inclui private final String reg = "C111";
    @Inclui private String numProc;
    @Inclui private String indProc;

    public String getReg() {
        return reg;
    }

    public String getNumProc() {
        return numProc;
    }

    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }

    public String getIndProc() {
        return indProc;
    }

    public void setIndProc(String indProc) {
        this.indProc = indProc;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}

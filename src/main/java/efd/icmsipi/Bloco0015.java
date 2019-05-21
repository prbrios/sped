package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class Bloco0015 {

    @Inclui
    private String reg = "0015";

    @Inclui
    private String ufSt;

    @Inclui
    private String ieSt;

    public String getReg() {
        return reg;
    }

    public String getUfSt() {
        return ufSt;
    }

    public void setUfSt(String ufSt) {
        this.ufSt = ufSt;
    }

    public String getIeSt() {
        return ieSt;
    }

    public void setIeSt(String ieSt) {
        this.ieSt = ieSt;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}

package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class Bloco0190 {

    @Inclui private final String reg = "0190";
    @Inclui private String unid;
    @Inclui private String descr;

    public String getReg() {
        return reg;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}

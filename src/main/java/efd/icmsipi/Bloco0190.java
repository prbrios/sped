package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;
import java.util.List;

public class Bloco0190 {

    private final String reg = "0190";
    private String unid;
    private String descr;

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

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.unid);
        arr.add(this.descr);

        return Parsers.converteBlocoEmString(arr);

    }
}

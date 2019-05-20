package efd.icmsipi;

import efd.Parsers;
import efd.UF;

import java.util.ArrayList;
import java.util.List;

public class Bloco0015 {

    private String reg = "0015";
    private UF ufSt;
    private String ieSt;

    public String getReg() {
        return reg;
    }

    public UF getUfSt() {
        return ufSt;
    }

    public void setUfSt(UF ufSt) {
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

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.ufSt != null ? this.ufSt.getCodigo() : null);
        arr.add(this.ieSt);

        return Parsers.converteBlocoEmString(arr);

    }

}

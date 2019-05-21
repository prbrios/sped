package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class BlocoC105 {

    @Inclui private final String reg = "C105";
    @Inclui private String oper;
    @Inclui private String uf;

    public String getReg() {
        return reg;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}

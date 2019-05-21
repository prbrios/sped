package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class Bloco0400 {

    @Inclui private final String reg = "0400";
    @Inclui private String codNat;
    @Inclui private String descrNat;

    public String getReg() {
        return reg;
    }

    public String getCodNat() {
        return codNat;
    }

    public void setCodNat(String codNat) {
        this.codNat = codNat;
    }

    public String getDescrNat() {
        return descrNat;
    }

    public void setDescrNat(String descrNat) {
        this.descrNat = descrNat;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}

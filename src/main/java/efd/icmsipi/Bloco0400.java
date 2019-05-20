package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;
import java.util.List;

public class Bloco0400 {

    private final String reg = "0400";
    private String codNat;
    private String descrNat;

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

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.codNat);
        arr.add(this.descrNat);

        return Parsers.converteBlocoEmString(arr);

    }

}

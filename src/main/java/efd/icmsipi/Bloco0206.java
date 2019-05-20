package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;
import java.util.List;

public class Bloco0206 {

    private final String reg = "0206";
    private String codComb;

    public String getReg() {
        return reg;
    }

    public String getCodComb() {
        return codComb;
    }

    public void setCodComb(String codComb) {
        this.codComb = codComb;
    }

    @Override
    public String toString(){

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.codComb);

        return Parsers.converteBlocoEmString(arr);

    }
}

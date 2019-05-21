package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class Bloco0206 {

    @Inclui private final String reg = "0206";
    @Inclui private String codComb;

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
        return Parsers.converteBlocoEmString(this);
    }

}

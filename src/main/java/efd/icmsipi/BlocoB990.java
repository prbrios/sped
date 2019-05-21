package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class BlocoB990 {

    @Inclui private final String reg = "B990";
    @Inclui private Integer qtdLinB;

    public String getReg() {
        return reg;
    }

    public Integer getQtdLinB() {
        return qtdLinB;
    }

    public void setQtdLinB(Integer qtdLinB) {
        this.qtdLinB = qtdLinB;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}

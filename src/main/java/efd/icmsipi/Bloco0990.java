package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class Bloco0990 {

    @Inclui private final String reg = "0990";
    @Inclui private Integer qtdLin0;

    public String getReg() {
        return reg;
    }

    public Integer getQtdLin0() {
        return qtdLin0;
    }

    public void setQtdLin0(Integer qtdLin0) {
        this.qtdLin0 = qtdLin0;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}

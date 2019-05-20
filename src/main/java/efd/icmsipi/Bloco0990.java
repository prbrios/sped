package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;
import java.util.List;

public class Bloco0990 {

    private final String reg = "0990";
    private Integer qtdLin0;

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

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.qtdLin0);

        return Parsers.converteBlocoEmString(arr);

    }

}

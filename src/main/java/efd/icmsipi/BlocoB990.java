package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;

public class BlocoB990 {

    private final String reg = "B990";
    private Integer qtdLinB;

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

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.qtdLinB);

        return Parsers.converteBlocoEmString(arr);

    }
}

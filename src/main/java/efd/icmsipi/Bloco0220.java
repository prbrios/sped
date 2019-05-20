package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bloco0220 {

    private final String reg = "0220";
    private String unidConv;
    private BigDecimal fatConv;

    public String getReg() {
        return reg;
    }

    public String getUnidConv() {
        return unidConv;
    }

    public void setUnidConv(String unidConv) {
        this.unidConv = unidConv;
    }

    public BigDecimal getFatConv() {
        return fatConv;
    }

    public void setFatConv(BigDecimal fatConv) {
        this.fatConv = fatConv;
    }

    @Override
    public String toString(){

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.unidConv);
        arr.add(this.fatConv != null ? Parsers.formataNumero(this.fatConv, 2) : null);

        return Parsers.converteBlocoEmString(arr);

    }
}

package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.math.BigDecimal;

public class Bloco0220 {

    @Inclui private final String reg = "0220";
    @Inclui private String unidConv;
    @Inclui private BigDecimal fatConv;

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
        return Parsers.converteBlocoEmString(this);
    }

}

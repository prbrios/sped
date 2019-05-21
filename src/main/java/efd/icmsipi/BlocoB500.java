package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.math.BigDecimal;

public class BlocoB500 {

    @Inclui private final String reg = "B500";
    @Inclui private BigDecimal vlRec;
    @Inclui private Integer qtdProf;
    @Inclui private BigDecimal vlOr;

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlRec() {
        return vlRec;
    }

    public void setVlRec(BigDecimal vlRec) {
        this.vlRec = vlRec;
    }

    public Integer getQtdProf() {
        return qtdProf;
    }

    public void setQtdProf(Integer qtdProf) {
        this.qtdProf = qtdProf;
    }

    public BigDecimal getVlOr() {
        return vlOr;
    }

    public void setVlOr(BigDecimal vlOr) {
        this.vlOr = vlOr;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}

package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BlocoB500 {

    private final String reg = "B500";
    private BigDecimal vlRec;
    private Integer qtdProf;
    private BigDecimal vlOr;

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

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.vlRec != null ? Parsers.formataNumero(this.vlRec, 2) : null);
        arr.add(this.qtdProf);
        arr.add(this.vlOr != null ? Parsers.formataNumero(this.vlOr, 2) : null);

        return Parsers.converteBlocoEmString(arr);

    }

}

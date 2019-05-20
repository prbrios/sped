package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bloco0210 {

    private final String reg = "0210";
    private String codItemComp;
    private BigDecimal qtdComp;
    private BigDecimal perda;

    public String getReg() {
        return reg;
    }

    public String getCodItemComp() {
        return codItemComp;
    }

    public void setCodItemComp(String codItemComp) {
        this.codItemComp = codItemComp;
    }

    public BigDecimal getQtdComp() {
        return qtdComp;
    }

    public void setQtdComp(BigDecimal qtdComp) {
        this.qtdComp = qtdComp;
    }

    public BigDecimal getPerda() {
        return perda;
    }

    public void setPerda(BigDecimal perda) {
        this.perda = perda;
    }

    @Override
    public String toString(){

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.codItemComp);
        arr.add(this.qtdComp != null ? Parsers.formataNumero(this.qtdComp, 2) : null);
        arr.add(this.perda != null ? Parsers.formataNumero(this.perda, 2) : null);

        return Parsers.converteBlocoEmString(arr);

    }
}

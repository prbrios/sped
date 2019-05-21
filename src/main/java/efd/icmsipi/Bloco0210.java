package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.math.BigDecimal;

public class Bloco0210 {

    @Inclui private final String reg = "0210";
    @Inclui private String codItemComp;
    @Inclui private BigDecimal qtdComp;
    @Inclui private BigDecimal perda;

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
        return Parsers.converteBlocoEmString(this);
    }
}

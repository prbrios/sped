package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BlocoC140 {

    private final String reg = "C140";
    private IndEmit indEmit;
    private IndTit indTit;
    private String descTit;
    private String numTit;
    private Integer qtdParc;
    private BigDecimal vlTit;

    public String getReg() {
        return reg;
    }

    public IndEmit getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(IndEmit indEmit) {
        this.indEmit = indEmit;
    }

    public IndTit getIndTit() {
        return indTit;
    }

    public void setIndTit(IndTit indTit) {
        this.indTit = indTit;
    }

    public String getDescTit() {
        return descTit;
    }

    public void setDescTit(String descTit) {
        this.descTit = descTit;
    }

    public String getNumTit() {
        return numTit;
    }

    public void setNumTit(String numTit) {
        this.numTit = numTit;
    }

    public Integer getQtdParc() {
        return qtdParc;
    }

    public void setQtdParc(Integer qtdParc) {
        this.qtdParc = qtdParc;
    }

    public BigDecimal getVlTit() {
        return vlTit;
    }

    public void setVlTit(BigDecimal vlTit) {
        this.vlTit = vlTit;
    }

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.indEmit != null ? this.indEmit.getCodigo() : null);
        arr.add(this.indTit != null ? this.indTit.getCodigo() : null);
        arr.add(this.descTit);
        arr.add(this.numTit);
        arr.add(this.qtdParc);
        arr.add(this.vlTit != null ? Parsers.formataNumero(this.vlTit, 2) : null);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum IndEmit {

        EMISSAO_PROPRIA("0"),
        TERCEIROS("1");

        private String codigo;

        IndEmit(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
    }

    public enum IndTit {

        DUPLICATA("00"),
        CHEQUE("01"),
        PROMISSORIA("02"),
        RECIBO("03"),
        OUTRO("99");

        private String codigo;

        IndTit(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
    }
}

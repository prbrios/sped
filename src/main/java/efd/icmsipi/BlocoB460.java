package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BlocoB460 {

    private final String reg = "B460";
    private IndDed indDed;
    private BigDecimal vlDed;
    private String numProc;
    private IndProc indProc;
    private String proc;
    private String codInfObs;
    private IndObr indObr;

    public String getReg() {
        return reg;
    }

    public IndDed getIndDed() {
        return indDed;
    }

    public void setIndDed(IndDed indDed) {
        this.indDed = indDed;
    }

    public BigDecimal getVlDed() {
        return vlDed;
    }

    public void setVlDed(BigDecimal vlDed) {
        this.vlDed = vlDed;
    }

    public String getNumProc() {
        return numProc;
    }

    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }

    public IndProc getIndProc() {
        return indProc;
    }

    public void setIndProc(IndProc indProc) {
        this.indProc = indProc;
    }

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public String getCodInfObs() {
        return codInfObs;
    }

    public void setCodInfObs(String codInfObs) {
        this.codInfObs = codInfObs;
    }

    public IndObr getIndObr() {
        return indObr;
    }

    public void setIndObr(IndObr indObr) {
        this.indObr = indObr;
    }

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.indDed != null ? this.indDed.getCodigo() : null);
        arr.add(this.vlDed != null ? Parsers.formataNumero(this.vlDed, 2) : null);
        arr.add(this.numProc);
        arr.add(this.indProc != null ? this.indProc.getCodigo() : null);
        arr.add(this.proc);
        arr.add(this.codInfObs);
        arr.add(this.indObr != null ? this.indObr.getCodigo() : null);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum IndDed {

        COMPENSACAO_DO_ISS_CALCULADO_A_MAIOR("0"),
        BENEFICIO_FISCAL_POR_INCENTIVO_A_CULTURA("1"),
        DECISAO_ADMINISTRATIVA_OU_JUDICIAL("2"),
        OUTROS("9");

        private String codigo;

        IndDed(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }

    }

    public enum IndProc {

        SEFIN("0"),
        JUSTICA_FEDERAL("1"),
        JUSTICA_ESTADUAL("2"),
        OUTROS("9");

        private String codigo;

        IndProc(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }

    }

    public enum IndObr {

        ISS_PROPRIO("0"),
        ISS_SUBSTITUTO("1"),
        ISS_UNIPROFISSIONAL("2");

        private String codigo;

        IndObr(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
    }
}

package efd.icmsipi;

import efd.Parsers;

import java.time.LocalDate;
import java.util.ArrayList;

public class BlocoC113 {

    private final String reg = "C113";
    private IndOper indOper;
    private IndEmit indEmit;
    private String codPart;
    private String codMod;
    private String ser;
    private String sub;
    private Integer numDoc;
    private LocalDate dtDoc;
    private String chvDoce;

    public String getReg() {
        return reg;
    }

    public IndOper getIndOper() {
        return indOper;
    }

    public void setIndOper(IndOper indOper) {
        this.indOper = indOper;
    }

    public IndEmit getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(IndEmit indEmit) {
        this.indEmit = indEmit;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public Integer getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Integer numDoc) {
        this.numDoc = numDoc;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }

    public String getChvDoce() {
        return chvDoce;
    }

    public void setChvDoce(String chvDoce) {
        this.chvDoce = chvDoce;
    }

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();
        arr.add(this.reg);
        arr.add(this.indOper != null ? this.indOper.getCodigo() : null);
        arr.add(this.indEmit != null ? this.indEmit.getCodigo() : null);
        arr.add(this.codPart);
        arr.add(this.codMod);
        arr.add(this.ser);
        arr.add(this.sub);
        arr.add(this.numDoc);
        arr.add(this.dtDoc != null ? Parsers.formataData(this.dtDoc, "ddMMyyyy") : null);
        arr.add(this.chvDoce);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum IndOper {

        ENTRADA_AQUISICAO("0"),
        SAIDA_PRESTACAO("1");

        private String codigo;

        IndOper(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
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
}

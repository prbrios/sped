package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class BlocoC100 {

    private final String reg = "C100";
    private IndOper indOper;
    private IndEmit indEmit;
    private String codPart;
    private String codMod;
    private String codSit;
    private String ser;
    private Integer numDoc;
    private String chvNfe;
    private LocalDate dtDoc;
    private LocalDate dtES;
    private BigDecimal vlDoc;
    private IndPgto indPgto;
    private BigDecimal vlDesc;
    private BigDecimal vlAbatNt;
    private BigDecimal vlMerc;
    private IndFrt indFrt;
    private BigDecimal vlFrt;
    private BigDecimal vlSeg;
    private BigDecimal vlOutDa;
    private BigDecimal vlBcIcms;
    private BigDecimal vlIcms;
    private BigDecimal vlBcIcmsSt;
    private BigDecimal vlIcmsSt;
    private BigDecimal vlIpi;
    private BigDecimal vlPis;
    private BigDecimal vlCofins;
    private BigDecimal vlPisSt;
    private BigDecimal vlCofinsSt;

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

    public String getCodSit() {
        return codSit;
    }

    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public Integer getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Integer numDoc) {
        this.numDoc = numDoc;
    }

    public String getChvNfe() {
        return chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }

    public LocalDate getDtES() {
        return dtES;
    }

    public void setDtES(LocalDate dtES) {
        this.dtES = dtES;
    }

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }

    public IndPgto getIndPgto() {
        return indPgto;
    }

    public void setIndPgto(IndPgto indPgto) {
        this.indPgto = indPgto;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public BigDecimal getVlAbatNt() {
        return vlAbatNt;
    }

    public void setVlAbatNt(BigDecimal vlAbatNt) {
        this.vlAbatNt = vlAbatNt;
    }

    public BigDecimal getVlMerc() {
        return vlMerc;
    }

    public void setVlMerc(BigDecimal vlMerc) {
        this.vlMerc = vlMerc;
    }

    public IndFrt getIndFrt() {
        return indFrt;
    }

    public void setIndFrt(IndFrt indFrt) {
        this.indFrt = indFrt;
    }

    public BigDecimal getVlFrt() {
        return vlFrt;
    }

    public void setVlFrt(BigDecimal vlFrt) {
        this.vlFrt = vlFrt;
    }

    public BigDecimal getVlSeg() {
        return vlSeg;
    }

    public void setVlSeg(BigDecimal vlSeg) {
        this.vlSeg = vlSeg;
    }

    public BigDecimal getVlOutDa() {
        return vlOutDa;
    }

    public void setVlOutDa(BigDecimal vlOutDa) {
        this.vlOutDa = vlOutDa;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public BigDecimal getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }

    public BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }

    public BigDecimal getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(BigDecimal vlIpi) {
        this.vlIpi = vlIpi;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public BigDecimal getVlPisSt() {
        return vlPisSt;
    }

    public void setVlPisSt(BigDecimal vlPisSt) {
        this.vlPisSt = vlPisSt;
    }

    public BigDecimal getVlCofinsSt() {
        return vlCofinsSt;
    }

    public void setVlCofinsSt(BigDecimal vlCofinsSt) {
        this.vlCofinsSt = vlCofinsSt;
    }

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.indOper != null ? this.indOper.getCodigo() : null);
        arr.add(this.indEmit != null ? this.indEmit.getCodigo() : null);
        arr.add(this.codPart);
        arr.add(this.codMod);
        arr.add(this.codSit);
        arr.add(this.ser);
        arr.add(this.numDoc);
        arr.add(this.chvNfe);
        arr.add(this.dtDoc != null ? Parsers.formataData(this.dtDoc, "ddMMyyyy") : null);
        arr.add(this.dtES != null ? Parsers.formataData(this.dtES, "ddMMyyyy") : null);
        arr.add(this.vlDoc != null ? Parsers.formataNumero(this.vlDoc, 2) : null);
        arr.add(this.indPgto != null ? this.indPgto.getCodigo() : null);
        arr.add(this.vlDesc != null ? Parsers.formataNumero(this.vlDesc, 2) : null);
        arr.add(this.vlAbatNt != null ? Parsers.formataNumero(this.vlAbatNt, 2) : null);
        arr.add(this.vlMerc != null ? Parsers.formataNumero(this.vlMerc, 2) : null);
        arr.add(this.indFrt!= null ? this.indFrt.getCodigo() : null );
        arr.add(this.vlFrt != null ? Parsers.formataNumero(this.vlFrt, 2) : null);
        arr.add(this.vlSeg != null ? Parsers.formataNumero(this.vlSeg, 2) : null);
        arr.add(this.vlOutDa != null ? Parsers.formataNumero(this.vlOutDa, 2) : null);
        arr.add(this.vlBcIcms != null ? Parsers.formataNumero(this.vlBcIcms, 2) : null);
        arr.add(this.vlIcms != null ? Parsers.formataNumero(this.vlIcms, 2) : null);
        arr.add(this.vlBcIcmsSt != null ? Parsers.formataNumero(this.vlBcIcmsSt, 2) : null);
        arr.add(this.vlIcmsSt != null ? Parsers.formataNumero(this.vlIcmsSt, 2) : null);
        arr.add(this.vlIpi != null ? Parsers.formataNumero(this.vlIpi, 2) : null);
        arr.add(this.vlPis != null ? Parsers.formataNumero(this.vlPis, 2) : null);
        arr.add(this.vlCofins != null ? Parsers.formataNumero(this.vlCofins, 2) : null);
        arr.add(this.vlPisSt != null ? Parsers.formataNumero(this.vlPisSt, 2) : null);
        arr.add(this.vlCofinsSt != null ? Parsers.formataNumero(this.vlCofinsSt, 2) : null);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum IndOper {

        ENTRADA("0"),
        SAIDA("1");

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

    public enum IndPgto {

        A_VISTA("0"),
        A_PRAZO("1"),
        OUTROS("2");

        private String codigo;

        IndPgto(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
    }

    public enum IndFrt {

        CIF("0"),
        FOB("1"),
        POR_CONTA_DE_TERCEIROS("2"),
        TRANSPORTE_PROPRIO_POR_CONTA_DO_REMETENTE("3"),
        TRANSPORTE_PROPRIO_POR_CONTA_DO_DESTINATARIO("4"),
        SEM_OCORRENCIA_DE_TRANSPORTE("9");

        private String codigo;

        IndFrt(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
    }

}

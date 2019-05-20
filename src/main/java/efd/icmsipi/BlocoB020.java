package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BlocoB020 {

    private final String reg = "B020";
    private IndOper indOper;
    private IndEmit indEmit;
    private String codPart;
    private String codMod;
    private String codSit;
    private String ser;
    private String numDoc;
    private String chvNfe;
    private LocalDate dtDoc;
    private String codMunServ;
    private BigDecimal vlCont;
    private BigDecimal vlMatTerc;
    private BigDecimal vlSub;
    private BigDecimal vlInstIss;
    private BigDecimal vlDedBc;
    private BigDecimal vlBcIss;
    private BigDecimal vlBsIssRt;
    private BigDecimal vlIssRt;
    private BigDecimal vlIss;
    private String codInfObs;

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

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
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

    public String getCodMunServ() {
        return codMunServ;
    }

    public void setCodMunServ(String codMunServ) {
        this.codMunServ = codMunServ;
    }

    public BigDecimal getVlCont() {
        return vlCont;
    }

    public void setVlCont(BigDecimal vlCont) {
        this.vlCont = vlCont;
    }

    public BigDecimal getVlMatTerc() {
        return vlMatTerc;
    }

    public void setVlMatTerc(BigDecimal vlMatTerc) {
        this.vlMatTerc = vlMatTerc;
    }

    public BigDecimal getVlSub() {
        return vlSub;
    }

    public void setVlSub(BigDecimal vlSub) {
        this.vlSub = vlSub;
    }

    public BigDecimal getVlInstIss() {
        return vlInstIss;
    }

    public void setVlInstIss(BigDecimal vlInstIss) {
        this.vlInstIss = vlInstIss;
    }

    public BigDecimal getVlDedBc() {
        return vlDedBc;
    }

    public void setVlDedBc(BigDecimal vlDedBc) {
        this.vlDedBc = vlDedBc;
    }

    public BigDecimal getVlBcIss() {
        return vlBcIss;
    }

    public void setVlBcIss(BigDecimal vlBcIss) {
        this.vlBcIss = vlBcIss;
    }

    public BigDecimal getVlBsIssRt() {
        return vlBsIssRt;
    }

    public void setVlBsIssRt(BigDecimal vlBsIssRt) {
        this.vlBsIssRt = vlBsIssRt;
    }

    public BigDecimal getVlIssRt() {
        return vlIssRt;
    }

    public void setVlIssRt(BigDecimal vlIssRt) {
        this.vlIssRt = vlIssRt;
    }

    public BigDecimal getVlIss() {
        return vlIss;
    }

    public void setVlIss(BigDecimal vlIss) {
        this.vlIss = vlIss;
    }

    public String getCodInfObs() {
        return codInfObs;
    }

    public void setCodInfObs(String codInfObs) {
        this.codInfObs = codInfObs;
    }

    @Override
    public String toString(){

        List arr = new ArrayList<>();

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
        arr.add(this.codMunServ);
        arr.add(this.vlCont != null ? Parsers.formataNumero(this.vlCont, 2) : null);
        arr.add(this.vlMatTerc != null ? Parsers.formataNumero(this.vlMatTerc, 2) : null);
        arr.add(this.vlSub != null ? Parsers.formataNumero(this.vlSub, 2) : null);
        arr.add(this.vlInstIss != null ? Parsers.formataNumero(this.vlInstIss, 2) : null);
        arr.add(this.vlDedBc != null ? Parsers.formataNumero(this.vlDedBc, 2) : null);
        arr.add(this.vlBcIss != null ? Parsers.formataNumero(this.vlBcIss, 2) : null);
        arr.add(this.vlBsIssRt != null ? Parsers.formataNumero(this.vlBsIssRt, 2) : null);
        arr.add(this.vlIssRt != null ? Parsers.formataNumero(this.vlIssRt, 2) : null);
        arr.add(this.vlIss != null ? Parsers.formataNumero(this.vlIss, 2) : null);
        arr.add(this.codInfObs);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum IndOper {

        AQUISICAO("0"),
        PRESTACAO("1");

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

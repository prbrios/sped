package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BlocoB020 {

    @Inclui private final String reg = "B020";
    @Inclui private String indOper;
    @Inclui private String indEmit;
    @Inclui private String codPart;
    @Inclui private String codMod;
    @Inclui private String codSit;
    @Inclui private String ser;
    @Inclui private String numDoc;
    @Inclui private String chvNfe;
    @Inclui private LocalDate dtDoc;
    @Inclui private String codMunServ;
    @Inclui private BigDecimal vlCont;
    @Inclui private BigDecimal vlMatTerc;
    @Inclui private BigDecimal vlSub;
    @Inclui private BigDecimal vlInstIss;
    @Inclui private BigDecimal vlDedBc;
    @Inclui private BigDecimal vlBcIss;
    @Inclui private BigDecimal vlBsIssRt;
    @Inclui private BigDecimal vlIssRt;
    @Inclui private BigDecimal vlIss;
    @Inclui private String codInfObs;

    public String getReg() {
        return reg;
    }

    public String getIndOper() {
        return indOper;
    }

    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }

    public String getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(String indEmit) {
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
        return Parsers.converteBlocoEmString(this);
    }

}

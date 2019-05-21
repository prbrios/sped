package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BlocoB030 {

    @Inclui private final String reg = "B030";
    @Inclui private String codMod;
    @Inclui private String ser;
    @Inclui private Integer numDocIni;
    @Inclui private Integer numDocFin;
    @Inclui private LocalDate dtDoc;
    @Inclui private Integer qtdCanc;
    @Inclui private BigDecimal vlCont;
    @Inclui private BigDecimal vlIsntIss;
    @Inclui private BigDecimal vlBcIss;
    @Inclui private BigDecimal vlIss;
    @Inclui private String codInfObs;

    public String getReg() {
        return reg;
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

    public Integer getNumDocIni() {
        return numDocIni;
    }

    public void setNumDocIni(Integer numDocIni) {
        this.numDocIni = numDocIni;
    }

    public Integer getNumDocFin() {
        return numDocFin;
    }

    public void setNumDocFin(Integer numDocFin) {
        this.numDocFin = numDocFin;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }

    public Integer getQtdCanc() {
        return qtdCanc;
    }

    public void setQtdCanc(Integer qtdCanc) {
        this.qtdCanc = qtdCanc;
    }

    public BigDecimal getVlCont() {
        return vlCont;
    }

    public void setVlCont(BigDecimal vlCont) {
        this.vlCont = vlCont;
    }

    public BigDecimal getVlIsntIss() {
        return vlIsntIss;
    }

    public void setVlIsntIss(BigDecimal vlIsntIss) {
        this.vlIsntIss = vlIsntIss;
    }

    public BigDecimal getVlBcIss() {
        return vlBcIss;
    }

    public void setVlBcIss(BigDecimal vlBcIss) {
        this.vlBcIss = vlBcIss;
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

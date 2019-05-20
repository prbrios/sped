package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BlocoB030 {

    private final String reg = "B030";
    private String codMod;
    private String ser;
    private Integer numDocIni;
    private Integer numDocFin;
    private LocalDate dtDoc;
    private Integer qtdCanc;
    private BigDecimal vlCont;
    private BigDecimal vlIsntIss;
    private BigDecimal vlBcIss;
    private BigDecimal vlIss;
    private String codInfObs;

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

        List arr = new ArrayList<>();

        arr.add(reg);
        arr.add(codMod);
        arr.add(ser);
        arr.add(numDocIni);
        arr.add(numDocFin);
        arr.add(this.dtDoc != null ? Parsers.formataData(this.dtDoc, "ddMMyyyy") : null);
        arr.add(qtdCanc);
        arr.add(this.vlCont != null ? Parsers.formataNumero(this.vlCont, 2) : null);
        arr.add(this.vlIsntIss != null ? Parsers.formataNumero(this.vlIsntIss, 2) : null);
        arr.add(this.vlBcIss != null ? Parsers.formataNumero(this.vlBcIss, 2) : null);
        arr.add(this.vlIss != null ? Parsers.formataNumero(this.vlIss, 2) : null);
        arr.add(codInfObs);

        return Parsers.converteBlocoEmString(arr);

    }
}

package efd.icmsipi;

import efd.Parsers;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BlocoB350 {

    private final String reg = "B350";
    private String codCtd;
    private String ctaIss;
    private String ctaCosif;
    private Integer qtdOcor;
    private String codServ;
    private BigDecimal vlCont;
    private BigDecimal vlBcIss;
    private BigDecimal aliqIss;
    private BigDecimal vlIss;
    private String codIndObs;

    public String getReg() {
        return reg;
    }

    public String getCodCtd() {
        return codCtd;
    }

    public void setCodCtd(String codCtd) {
        this.codCtd = codCtd;
    }

    public String getCtaIss() {
        return ctaIss;
    }

    public void setCtaIss(String ctaIss) {
        this.ctaIss = ctaIss;
    }

    public String getCtaCosif() {
        return ctaCosif;
    }

    public void setCtaCosif(String ctaCosif) {
        this.ctaCosif = ctaCosif;
    }

    public Integer getQtdOcor() {
        return qtdOcor;
    }

    public void setQtdOcor(Integer qtdOcor) {
        this.qtdOcor = qtdOcor;
    }

    public String getCodServ() {
        return codServ;
    }

    public void setCodServ(String codServ) {
        this.codServ = codServ;
    }

    public BigDecimal getVlCont() {
        return vlCont;
    }

    public void setVlCont(BigDecimal vlCont) {
        this.vlCont = vlCont;
    }

    public BigDecimal getVlBcIss() {
        return vlBcIss;
    }

    public void setVlBcIss(BigDecimal vlBcIss) {
        this.vlBcIss = vlBcIss;
    }

    public BigDecimal getAliqIss() {
        return aliqIss;
    }

    public void setAliqIss(BigDecimal aliqIss) {
        this.aliqIss = aliqIss;
    }

    public BigDecimal getVlIss() {
        return vlIss;
    }

    public void setVlIss(BigDecimal vlIss) {
        this.vlIss = vlIss;
    }

    public String getCodIndObs() {
        return codIndObs;
    }

    public void setCodIndObs(String codIndObs) {
        this.codIndObs = codIndObs;
    }

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.codCtd);
        arr.add(this.ctaIss);
        arr.add(this.ctaCosif);
        arr.add(this.qtdOcor);
        arr.add(this.codServ);
        arr.add(this.vlCont != null ? Parsers.formataNumero(this.vlCont, 2) : null);
        arr.add(this.vlBcIss != null ? Parsers.formataNumero(this.vlBcIss, 2) : null);
        arr.add(this.aliqIss != null ? Parsers.formataNumero(this.aliqIss, 2) : null);
        arr.add(this.vlIss != null ? Parsers.formataNumero(this.vlIss, 2) : null);
        arr.add(this.codIndObs);

        return Parsers.converteBlocoEmString(arr);

    }
}

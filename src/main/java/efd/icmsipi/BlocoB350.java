package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.math.BigDecimal;

public class BlocoB350 {

    @Inclui private final String reg = "B350";
    @Inclui private String codCtd;
    @Inclui private String ctaIss;
    @Inclui private String ctaCosif;
    @Inclui private Integer qtdOcor;
    @Inclui private String codServ;
    @Inclui private BigDecimal vlCont;
    @Inclui private BigDecimal vlBcIss;
    @Inclui private BigDecimal aliqIss;
    @Inclui private BigDecimal vlIss;
    @Inclui private String codIndObs;

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
        return Parsers.converteBlocoEmString(this);
    }

}

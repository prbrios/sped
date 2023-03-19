package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegB350 implements Serializable {
	private static final long serialVersionUID = -1737814539193547357L;

	@Inclui
    private final String reg = "B350";

    @Inclui
    private String codCtd;

    @Inclui
    private String ctaIss;

    @Inclui(zerosEsquerda = 8)
    private Integer ctaCosif;

    @Inclui
    private Integer qtdOcor;

    @Inclui(zerosEsquerda = 4)
    private Integer codServ;

    @Inclui
    private BigDecimal vlCont;

    @Inclui
    private BigDecimal vlBcIss;

    @Inclui
    private BigDecimal aliqIss;

    @Inclui
    private BigDecimal vlIss;

    @Inclui
    private String codIndObs;

    public RegB350(String codCtd, String ctaIss, Integer ctaCosif, Integer qtdOcor, Integer codServ, BigDecimal vlCont, BigDecimal vlBcIss, BigDecimal aliqIss, BigDecimal vlIss, String codIndObs) {
        this.codCtd = codCtd;
        this.ctaIss = ctaIss;
        this.ctaCosif = ctaCosif;
        this.qtdOcor = qtdOcor;
        this.codServ = codServ;
        this.vlCont = vlCont;
        this.vlBcIss = vlBcIss;
        this.aliqIss = aliqIss;
        this.vlIss = vlIss;
        this.codIndObs = codIndObs;
    }

    public RegB350(){}

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

    public Integer getCtaCosif() {
        return ctaCosif;
    }

    public void setCtaCosif(Integer ctaCosif) {
        this.ctaCosif = ctaCosif;
    }

    public Integer getQtdOcor() {
        return qtdOcor;
    }

    public void setQtdOcor(Integer qtdOcor) {
        this.qtdOcor = qtdOcor;
    }

    public Integer getCodServ() {
        return codServ;
    }

    public void setCodServ(Integer codServ) {
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
    
}

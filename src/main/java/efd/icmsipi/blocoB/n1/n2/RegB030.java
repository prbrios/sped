package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegB030 implements Serializable {
	private static final long serialVersionUID = -1731272944364057293L;

	@Inclui
    private final String reg = "B030";

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Long numDocIni;

    @Inclui
    private Long numDocFin;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private Integer qtdCanc;

    @Inclui
    private BigDecimal vlCont;

    @Inclui
    private BigDecimal vlIsntIss;

    @Inclui
    private BigDecimal vlBcIss;

    @Inclui
    private BigDecimal vlIss;

    @Inclui
    private String codInfObs;

    public RegB030(String codMod, String ser, Long numDocIni, Long numDocFin, LocalDate dtDoc, Integer qtdCanc, BigDecimal vlCont, BigDecimal vlIsntIss, BigDecimal vlBcIss, BigDecimal vlIss, String codInfObs) {
        this.codMod = codMod;
        this.ser = ser;
        this.numDocIni = numDocIni;
        this.numDocFin = numDocFin;
        this.dtDoc = dtDoc;
        this.qtdCanc = qtdCanc;
        this.vlCont = vlCont;
        this.vlIsntIss = vlIsntIss;
        this.vlBcIss = vlBcIss;
        this.vlIss = vlIss;
        this.codInfObs = codInfObs;
    }

    public RegB030(){}

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

    public Long getNumDocIni() {
        return numDocIni;
    }

    public void setNumDocIni(Long numDocIni) {
        this.numDocIni = numDocIni;
    }

    public Long getNumDocFin() {
        return numDocFin;
    }

    public void setNumDocFin(Long numDocFin) {
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
    
}

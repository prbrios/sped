package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegD162 implements Serializable {
	private static final long serialVersionUID = 5672293304819962150L;

	@Inclui
    private final String reg = "D162";

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Long numDoc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlMerc;

    @Inclui
    private Integer qtdVol;

    @Inclui
    private BigDecimal pesoBrt;

    @Inclui
    private BigDecimal pesoLiq;

    public RegD162(String codMod, String ser, Long numDoc, LocalDate dtDoc, BigDecimal vlDoc, BigDecimal vlMerc, Integer qtdVol, BigDecimal pesoBrt, BigDecimal pesoLiq) {
        this.codMod = codMod;
        this.ser = ser;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.vlDoc = vlDoc;
        this.vlMerc = vlMerc;
        this.qtdVol = qtdVol;
        this.pesoBrt = pesoBrt;
        this.pesoLiq = pesoLiq;
    }

    public RegD162(){}

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

    public Long getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Long numDoc) {
        this.numDoc = numDoc;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }

    public BigDecimal getVlMerc() {
        return vlMerc;
    }

    public void setVlMerc(BigDecimal vlMerc) {
        this.vlMerc = vlMerc;
    }

    public Integer getQtdVol() {
        return qtdVol;
    }

    public void setQtdVol(Integer qtdVol) {
        this.qtdVol = qtdVol;
    }

    public BigDecimal getPesoBrt() {
        return pesoBrt;
    }

    public void setPesoBrt(BigDecimal pesoBrt) {
        this.pesoBrt = pesoBrt;
    }

    public BigDecimal getPesoLiq() {
        return pesoLiq;
    }

    public void setPesoLiq(BigDecimal pesoLiq) {
        this.pesoLiq = pesoLiq;
    }
    
}
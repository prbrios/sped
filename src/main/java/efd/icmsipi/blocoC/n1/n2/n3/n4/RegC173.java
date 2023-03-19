package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegC173 implements Serializable {
	private static final long serialVersionUID = 2462772394773952613L;

	@Inclui
    private final String reg = "C173";

    @Inclui
    private String loteMed;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtdItem;

    @Inclui
    private LocalDate dtFab;

    @Inclui
    private LocalDate dtVal;

    @Inclui
    private String indMed;

    @Inclui
    private String tpProd;

    @Inclui
    private BigDecimal vlTabMax;

    public RegC173(String loteMed, BigDecimal qtdItem, LocalDate dtFab, LocalDate dtVal, String indMed, String tpProd, BigDecimal vlTabMax) {
        this.loteMed = loteMed;
        this.qtdItem = qtdItem;
        this.dtFab = dtFab;
        this.dtVal = dtVal;
        this.indMed = indMed;
        this.tpProd = tpProd;
        this.vlTabMax = vlTabMax;
    }

    public RegC173(){}

    public String getReg() {
        return reg;
    }

    public String getLoteMed() {
        return loteMed;
    }

    public void setLoteMed(String loteMed) {
        this.loteMed = loteMed;
    }

    public BigDecimal getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(BigDecimal qtdItem) {
        this.qtdItem = qtdItem;
    }

    public LocalDate getDtFab() {
        return dtFab;
    }

    public void setDtFab(LocalDate dtFab) {
        this.dtFab = dtFab;
    }

    public LocalDate getDtVal() {
        return dtVal;
    }

    public void setDtVal(LocalDate dtVal) {
        this.dtVal = dtVal;
    }

    public String getIndMed() {
        return indMed;
    }

    public void setIndMed(String indMed) {
        this.indMed = indMed;
    }

    public String getTpProd() {
        return tpProd;
    }

    public void setTpProd(String tpProd) {
        this.tpProd = tpProd;
    }

    public BigDecimal getVlTabMax() {
        return vlTabMax;
    }

    public void setVlTabMax(BigDecimal vlTabMax) {
        this.vlTabMax = vlTabMax;
    }
    
}

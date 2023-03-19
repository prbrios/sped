package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;



import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1300 implements Serializable {
	private static final long serialVersionUID = 1657885489958630636L;

	@Inclui
	private final String reg = "1300";

    @Inclui(zerosEsquerda = 2)
    private Integer indNatRet;

    @Inclui(formatoData = "MMyyyy")
    private LocalDate prRecRet;

    @Inclui
    private BigDecimal vlRetApu;

    @Inclui
    private BigDecimal vlRetDed;

    @Inclui
    private BigDecimal vlRetPer;

    @Inclui
    private BigDecimal vlRetDcomp;

    @Inclui
    private BigDecimal sldRet;

    public Reg1300(Integer indNatRet, LocalDate prRecRet, BigDecimal vlRetApu, BigDecimal vlRetDed, BigDecimal vlRetPer, BigDecimal vlRetDcomp, BigDecimal sldRet) {
        this.indNatRet = indNatRet;
        this.prRecRet = prRecRet;
        this.vlRetApu = vlRetApu;
        this.vlRetDed = vlRetDed;
        this.vlRetPer = vlRetPer;
        this.vlRetDcomp = vlRetDcomp;
        this.sldRet = sldRet;
    }

    public Reg1300(){ }

    public String getReg() {
        return reg;
    }

    public Integer getIndNatRet() {
        return indNatRet;
    }

    public void setIndNatRet(Integer indNatRet) {
        this.indNatRet = indNatRet;
    }

    public LocalDate getPrRecRet() {
        return prRecRet;
    }

    public void setPrRecRet(LocalDate prRecRet) {
        this.prRecRet = prRecRet;
    }

    public BigDecimal getVlRetApu() {
        return vlRetApu;
    }

    public void setVlRetApu(BigDecimal vlRetApu) {
        this.vlRetApu = vlRetApu;
    }

    public BigDecimal getVlRetDed() {
        return vlRetDed;
    }

    public void setVlRetDed(BigDecimal vlRetDed) {
        this.vlRetDed = vlRetDed;
    }

    public BigDecimal getVlRetPer() {
        return vlRetPer;
    }

    public void setVlRetPer(BigDecimal vlRetPer) {
        this.vlRetPer = vlRetPer;
    }

    public BigDecimal getVlRetDcomp() {
        return vlRetDcomp;
    }

    public void setVlRetDcomp(BigDecimal vlRetDcomp) {
        this.vlRetDcomp = vlRetDcomp;
    }

    public BigDecimal getSldRet() {
        return sldRet;
    }

    public void setSldRet(BigDecimal sldRet) {
        this.sldRet = sldRet;
    }
    
}

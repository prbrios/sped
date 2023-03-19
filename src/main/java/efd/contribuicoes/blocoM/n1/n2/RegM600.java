package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM605;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM610;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegM600 implements Serializable {
	private static final long serialVersionUID = 5962877550676541715L;

	@Inclui
	private final String reg = "M600";

    @Inclui
    private BigDecimal vlTotContNcPer;

    @Inclui
    private BigDecimal vlTotCredDesc;

    @Inclui
    private BigDecimal vltotCredDescAnt;

    @Inclui
    private BigDecimal vltotContNcDev;

    @Inclui
    private BigDecimal vlRetNc;

    @Inclui
    private BigDecimal vlOutDedNc;

    @Inclui
    private BigDecimal vlContNcRec;

    @Inclui
    private BigDecimal vlTotContCumPer;

    @Inclui
    private BigDecimal vlRetCum;

    @Inclui
    private BigDecimal vlOutDedCum;

    @Inclui
    private BigDecimal vlContCumRec;

    @Inclui
    private BigDecimal vlTotContRec;

    @Filho
    private List<RegM605> regM605;

    @Filho
    private List<RegM610> regM610;

    public RegM600(BigDecimal vlTotContNcPer, BigDecimal vlTotCredDesc, BigDecimal vltotCredDescAnt, BigDecimal vltotContNcDev, BigDecimal vlRetNc, BigDecimal vlOutDedNc, BigDecimal vlContNcRec, BigDecimal vlTotContCumPer, BigDecimal vlRetCum, BigDecimal vlOutDedCum, BigDecimal vlContCumRec, BigDecimal vlTotContRec) {
        this.vlTotContNcPer = vlTotContNcPer;
        this.vlTotCredDesc = vlTotCredDesc;
        this.vltotCredDescAnt = vltotCredDescAnt;
        this.vltotContNcDev = vltotContNcDev;
        this.vlRetNc = vlRetNc;
        this.vlOutDedNc = vlOutDedNc;
        this.vlContNcRec = vlContNcRec;
        this.vlTotContCumPer = vlTotContCumPer;
        this.vlRetCum = vlRetCum;
        this.vlOutDedCum = vlOutDedCum;
        this.vlContCumRec = vlContCumRec;
        this.vlTotContRec = vlTotContRec;
    }

    public RegM600(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlTotContNcPer() {
        return vlTotContNcPer;
    }

    public void setVlTotContNcPer(BigDecimal vlTotContNcPer) {
        this.vlTotContNcPer = vlTotContNcPer;
    }

    public BigDecimal getVlTotCredDesc() {
        return vlTotCredDesc;
    }

    public void setVlTotCredDesc(BigDecimal vlTotCredDesc) {
        this.vlTotCredDesc = vlTotCredDesc;
    }

    public BigDecimal getVltotCredDescAnt() {
        return vltotCredDescAnt;
    }

    public void setVltotCredDescAnt(BigDecimal vltotCredDescAnt) {
        this.vltotCredDescAnt = vltotCredDescAnt;
    }

    public BigDecimal getVltotContNcDev() {
        return vltotContNcDev;
    }

    public void setVltotContNcDev(BigDecimal vltotContNcDev) {
        this.vltotContNcDev = vltotContNcDev;
    }

    public BigDecimal getVlRetNc() {
        return vlRetNc;
    }

    public void setVlRetNc(BigDecimal vlRetNc) {
        this.vlRetNc = vlRetNc;
    }

    public BigDecimal getVlOutDedNc() {
        return vlOutDedNc;
    }

    public void setVlOutDedNc(BigDecimal vlOutDedNc) {
        this.vlOutDedNc = vlOutDedNc;
    }

    public BigDecimal getVlContNcRec() {
        return vlContNcRec;
    }

    public void setVlContNcRec(BigDecimal vlContNcRec) {
        this.vlContNcRec = vlContNcRec;
    }

    public BigDecimal getVlTotContCumPer() {
        return vlTotContCumPer;
    }

    public void setVlTotContCumPer(BigDecimal vlTotContCumPer) {
        this.vlTotContCumPer = vlTotContCumPer;
    }

    public BigDecimal getVlRetCum() {
        return vlRetCum;
    }

    public void setVlRetCum(BigDecimal vlRetCum) {
        this.vlRetCum = vlRetCum;
    }

    public BigDecimal getVlOutDedCum() {
        return vlOutDedCum;
    }

    public void setVlOutDedCum(BigDecimal vlOutDedCum) {
        this.vlOutDedCum = vlOutDedCum;
    }

    public BigDecimal getVlContCumRec() {
        return vlContCumRec;
    }

    public void setVlContCumRec(BigDecimal vlContCumRec) {
        this.vlContCumRec = vlContCumRec;
    }

    public BigDecimal getVlTotContRec() {
        return vlTotContRec;
    }

    public void setVlTotContRec(BigDecimal vlTotContRec) {
        this.vlTotContRec = vlTotContRec;
    }

    public List<RegM605> getRegM605() {
        return regM605;
    }

    public void setRegM605(List<RegM605> regM605) {
        this.regM605 = regM605;
    }

    public List<RegM610> getRegM610() {
        return regM610;
    }

    public void setRegM610(List<RegM610> regM610) {
        this.regM610 = regM610;
    }
    
}

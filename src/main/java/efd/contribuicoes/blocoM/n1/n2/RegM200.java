package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM205;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM210;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegM200 implements Serializable {
	private static final long serialVersionUID = -3449376050538652849L;

	@Inclui
    private final String reg = "M200";

    @Inclui
    private BigDecimal vlTotContNcPer;

    @Inclui
    private BigDecimal vlTotCredDesc;

    @Inclui
    private BigDecimal vlTotCredDescAnt;

    @Inclui
    private BigDecimal vlTotContNcDev;

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
    private List<RegM205> regM205;

    @Filho
    private List<RegM210> regM210;

    public RegM200(BigDecimal vlTotContNcPer, BigDecimal vlTotCredDesc, BigDecimal vlTotCredDescAnt, BigDecimal vlTotContNcDev, BigDecimal vlRetNc, BigDecimal vlOutDedNc, BigDecimal vlContNcRec, BigDecimal vlTotContCumPer, BigDecimal vlRetCum, BigDecimal vlOutDedCum, BigDecimal vlContCumRec, BigDecimal vlTotContRec) {
        this.vlTotContNcPer = vlTotContNcPer;
        this.vlTotCredDesc = vlTotCredDesc;
        this.vlTotCredDescAnt = vlTotCredDescAnt;
        this.vlTotContNcDev = vlTotContNcDev;
        this.vlRetNc = vlRetNc;
        this.vlOutDedNc = vlOutDedNc;
        this.vlContNcRec = vlContNcRec;
        this.vlTotContCumPer = vlTotContCumPer;
        this.vlRetCum = vlRetCum;
        this.vlOutDedCum = vlOutDedCum;
        this.vlContCumRec = vlContCumRec;
        this.vlTotContRec = vlTotContRec;
    }

    public RegM200(){}

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

    public BigDecimal getVlTotCredDescAnt() {
        return vlTotCredDescAnt;
    }

    public void setVlTotCredDescAnt(BigDecimal vlTotCredDescAnt) {
        this.vlTotCredDescAnt = vlTotCredDescAnt;
    }

    public BigDecimal getVlTotContNcDev() {
        return vlTotContNcDev;
    }

    public void setVlTotContNcDev(BigDecimal vlTotContNcDev) {
        this.vlTotContNcDev = vlTotContNcDev;
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

    public List<RegM205> getRegM205() {
        return regM205;
    }

    public void setRegM205(List<RegM205> regM205) {
        this.regM205 = regM205;
    }

    public List<RegM210> getRegM210() {
        return regM210;
    }

    public void setRegM210(List<RegM210> regM210) {
        this.regM210 = regM210;
    }

    
}

package efd.contribuicoes.blocoF.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegF205 implements Serializable {
	private static final long serialVersionUID = -7763089874442691580L;

	@Inclui
	private final String reg = "F205";

    @Inclui
    private BigDecimal vlCusIncAcumAnt;

    @Inclui
    private BigDecimal vlCusIncPerEsc;

    @Inclui
    private BigDecimal vlCusIncAcum;

    @Inclui
    private BigDecimal vlExcBcCusIncAcum;

    @Inclui
    private BigDecimal vlBcCusInc;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlCredPisAcum;

    @Inclui
    private BigDecimal vlCredPisDescAnt;

    @Inclui
    private BigDecimal vlCredPisDesc;

    @Inclui
    private BigDecimal vlCredPisDescFut;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCredCofinsAcum;

    @Inclui
    private BigDecimal vlCredCofinsDescAnt;

    @Inclui
    private BigDecimal vlCredCofinsDesc;

    @Inclui
    private BigDecimal vlCredCofinsDescFut;

    public RegF205(BigDecimal vlCusIncAcumAnt, BigDecimal vlCusIncPerEsc, BigDecimal vlCusIncAcum, BigDecimal vlExcBcCusIncAcum, BigDecimal vlBcCusInc, Integer cstPis, BigDecimal aliqPis, BigDecimal vlCredPisAcum, BigDecimal vlCredPisDescAnt, BigDecimal vlCredPisDesc, BigDecimal vlCredPisDescFut, Integer cstCofins, BigDecimal aliqCofins, BigDecimal vlCredCofinsAcum, BigDecimal vlCredCofinsDescAnt, BigDecimal vlCredCofinsDesc, BigDecimal vlCredCofinsDescFut) {
        this.vlCusIncAcumAnt = vlCusIncAcumAnt;
        this.vlCusIncPerEsc = vlCusIncPerEsc;
        this.vlCusIncAcum = vlCusIncAcum;
        this.vlExcBcCusIncAcum = vlExcBcCusIncAcum;
        this.vlBcCusInc = vlBcCusInc;
        this.cstPis = cstPis;
        this.aliqPis = aliqPis;
        this.vlCredPisAcum = vlCredPisAcum;
        this.vlCredPisDescAnt = vlCredPisDescAnt;
        this.vlCredPisDesc = vlCredPisDesc;
        this.vlCredPisDescFut = vlCredPisDescFut;
        this.cstCofins = cstCofins;
        this.aliqCofins = aliqCofins;
        this.vlCredCofinsAcum = vlCredCofinsAcum;
        this.vlCredCofinsDescAnt = vlCredCofinsDescAnt;
        this.vlCredCofinsDesc = vlCredCofinsDesc;
        this.vlCredCofinsDescFut = vlCredCofinsDescFut;
    }

    public RegF205(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlCusIncAcumAnt() {
        return vlCusIncAcumAnt;
    }

    public void setVlCusIncAcumAnt(BigDecimal vlCusIncAcumAnt) {
        this.vlCusIncAcumAnt = vlCusIncAcumAnt;
    }

    public BigDecimal getVlCusIncPerEsc() {
        return vlCusIncPerEsc;
    }

    public void setVlCusIncPerEsc(BigDecimal vlCusIncPerEsc) {
        this.vlCusIncPerEsc = vlCusIncPerEsc;
    }

    public BigDecimal getVlCusIncAcum() {
        return vlCusIncAcum;
    }

    public void setVlCusIncAcum(BigDecimal vlCusIncAcum) {
        this.vlCusIncAcum = vlCusIncAcum;
    }

    public BigDecimal getVlExcBcCusIncAcum() {
        return vlExcBcCusIncAcum;
    }

    public void setVlExcBcCusIncAcum(BigDecimal vlExcBcCusIncAcum) {
        this.vlExcBcCusIncAcum = vlExcBcCusIncAcum;
    }

    public BigDecimal getVlBcCusInc() {
        return vlBcCusInc;
    }

    public void setVlBcCusInc(BigDecimal vlBcCusInc) {
        this.vlBcCusInc = vlBcCusInc;
    }

    public Integer getCstPis() {
        return cstPis;
    }

    public void setCstPis(Integer cstPis) {
        this.cstPis = cstPis;
    }

    public BigDecimal getAliqPis() {
        return aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }

    public BigDecimal getVlCredPisAcum() {
        return vlCredPisAcum;
    }

    public void setVlCredPisAcum(BigDecimal vlCredPisAcum) {
        this.vlCredPisAcum = vlCredPisAcum;
    }

    public BigDecimal getVlCredPisDescAnt() {
        return vlCredPisDescAnt;
    }

    public void setVlCredPisDescAnt(BigDecimal vlCredPisDescAnt) {
        this.vlCredPisDescAnt = vlCredPisDescAnt;
    }

    public BigDecimal getVlCredPisDesc() {
        return vlCredPisDesc;
    }

    public void setVlCredPisDesc(BigDecimal vlCredPisDesc) {
        this.vlCredPisDesc = vlCredPisDesc;
    }

    public BigDecimal getVlCredPisDescFut() {
        return vlCredPisDescFut;
    }

    public void setVlCredPisDescFut(BigDecimal vlCredPisDescFut) {
        this.vlCredPisDescFut = vlCredPisDescFut;
    }

    public Integer getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(Integer cstCofins) {
        this.cstCofins = cstCofins;
    }

    public BigDecimal getAliqCofins() {
        return aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }

    public BigDecimal getVlCredCofinsAcum() {
        return vlCredCofinsAcum;
    }

    public void setVlCredCofinsAcum(BigDecimal vlCredCofinsAcum) {
        this.vlCredCofinsAcum = vlCredCofinsAcum;
    }

    public BigDecimal getVlCredCofinsDescAnt() {
        return vlCredCofinsDescAnt;
    }

    public void setVlCredCofinsDescAnt(BigDecimal vlCredCofinsDescAnt) {
        this.vlCredCofinsDescAnt = vlCredCofinsDescAnt;
    }

    public BigDecimal getVlCredCofinsDesc() {
        return vlCredCofinsDesc;
    }

    public void setVlCredCofinsDesc(BigDecimal vlCredCofinsDesc) {
        this.vlCredCofinsDesc = vlCredCofinsDesc;
    }

    public BigDecimal getVlCredCofinsDescFut() {
        return vlCredCofinsDescFut;
    }

    public void setVlCredCofinsDescFut(BigDecimal vlCredCofinsDescFut) {
        this.vlCredCofinsDescFut = vlCredCofinsDescFut;
    }
    
}

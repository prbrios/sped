package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg1800 implements Serializable {
	private static final long serialVersionUID = 4319977497936371499L;

	@Inclui
    private final String reg = "1800";

    @Inclui
    private BigDecimal vlCarga;

    @Inclui
    private BigDecimal vlPass;

    @Inclui
    private BigDecimal vlFat;

    @Inclui(casasDecimais = 6)
    private BigDecimal indRat;

    @Inclui
    private BigDecimal vlIcmsAnt;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcmsApur;

    @Inclui
    private BigDecimal vlBcIcmsApur;

    @Inclui
    private BigDecimal vlDif;

    public Reg1800(BigDecimal vlCarga, BigDecimal vlPass, BigDecimal vlFat, BigDecimal indRat, BigDecimal vlIcmsAnt, BigDecimal vlBcIcms, BigDecimal vlIcmsApur, BigDecimal vlBcIcmsApur, BigDecimal vlDif) {
        this.vlCarga = vlCarga;
        this.vlPass = vlPass;
        this.vlFat = vlFat;
        this.indRat = indRat;
        this.vlIcmsAnt = vlIcmsAnt;
        this.vlBcIcms = vlBcIcms;
        this.vlIcmsApur = vlIcmsApur;
        this.vlBcIcmsApur = vlBcIcmsApur;
        this.vlDif = vlDif;
    }

    public Reg1800(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlCarga() {
        return vlCarga;
    }

    public void setVlCarga(BigDecimal vlCarga) {
        this.vlCarga = vlCarga;
    }

    public BigDecimal getVlPass() {
        return vlPass;
    }

    public void setVlPass(BigDecimal vlPass) {
        this.vlPass = vlPass;
    }

    public BigDecimal getVlFat() {
        return vlFat;
    }

    public void setVlFat(BigDecimal vlFat) {
        this.vlFat = vlFat;
    }

    public BigDecimal getIndRat() {
        return indRat;
    }

    public void setIndRat(BigDecimal indRat) {
        this.indRat = indRat;
    }

    public BigDecimal getVlIcmsAnt() {
        return vlIcmsAnt;
    }

    public void setVlIcmsAnt(BigDecimal vlIcmsAnt) {
        this.vlIcmsAnt = vlIcmsAnt;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getVlIcmsApur() {
        return vlIcmsApur;
    }

    public void setVlIcmsApur(BigDecimal vlIcmsApur) {
        this.vlIcmsApur = vlIcmsApur;
    }

    public BigDecimal getVlBcIcmsApur() {
        return vlBcIcmsApur;
    }

    public void setVlBcIcmsApur(BigDecimal vlBcIcmsApur) {
        this.vlBcIcmsApur = vlBcIcmsApur;
    }

    public BigDecimal getVlDif() {
        return vlDif;
    }

    public void setVlDif(BigDecimal vlDif) {
        this.vlDif = vlDif;
    }
    
}
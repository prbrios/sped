package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegD130 implements Serializable {
	private static final long serialVersionUID = 1281485750075852594L;

	@Inclui
    private final String reg = "D130";

    @Inclui
    private String codPartConsg;

    @Inclui
    private String codPartRed;

    @Inclui
    private String indFrtRed;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Inclui
    private String veicId;

    @Inclui
    private BigDecimal vlLiqFrt;

    @Inclui
    private BigDecimal vlSecCat;

    @Inclui
    private BigDecimal vlDesp;

    @Inclui
    private BigDecimal vlPedg;

    @Inclui
    private BigDecimal vlOut;

    @Inclui
    private BigDecimal vlFrt;

    @Inclui
    private String ufId;

    public RegD130(String codPartConsg, String codPartRed, String indFrtRed, Integer codMunOrig, Integer codMunDest, String veicId, BigDecimal vlLiqFrt, BigDecimal vlSecCat, BigDecimal vlDesp, BigDecimal vlPedg, BigDecimal vlOut, BigDecimal vlFrt, String ufId) {
        this.codPartConsg = codPartConsg;
        this.codPartRed = codPartRed;
        this.indFrtRed = indFrtRed;
        this.codMunOrig = codMunOrig;
        this.codMunDest = codMunDest;
        this.veicId = veicId;
        this.vlLiqFrt = vlLiqFrt;
        this.vlSecCat = vlSecCat;
        this.vlDesp = vlDesp;
        this.vlPedg = vlPedg;
        this.vlOut = vlOut;
        this.vlFrt = vlFrt;
        this.ufId = ufId;
    }

    public RegD130(){}

    public String getReg() {
        return reg;
    }

    public String getCodPartConsg() {
        return codPartConsg;
    }

    public void setCodPartConsg(String codPartConsg) {
        this.codPartConsg = codPartConsg;
    }

    public String getCodPartRed() {
        return codPartRed;
    }

    public void setCodPartRed(String codPartRed) {
        this.codPartRed = codPartRed;
    }

    public String getIndFrtRed() {
        return indFrtRed;
    }

    public void setIndFrtRed(String indFrtRed) {
        this.indFrtRed = indFrtRed;
    }

    public Integer getCodMunOrig() {
        return codMunOrig;
    }

    public void setCodMunOrig(Integer codMunOrig) {
        this.codMunOrig = codMunOrig;
    }

    public Integer getCodMunDest() {
        return codMunDest;
    }

    public void setCodMunDest(Integer codMunDest) {
        this.codMunDest = codMunDest;
    }

    public String getVeicId() {
        return veicId;
    }

    public void setVeicId(String veicId) {
        this.veicId = veicId;
    }

    public BigDecimal getVlLiqFrt() {
        return vlLiqFrt;
    }

    public void setVlLiqFrt(BigDecimal vlLiqFrt) {
        this.vlLiqFrt = vlLiqFrt;
    }

    public BigDecimal getVlSecCat() {
        return vlSecCat;
    }

    public void setVlSecCat(BigDecimal vlSecCat) {
        this.vlSecCat = vlSecCat;
    }

    public BigDecimal getVlDesp() {
        return vlDesp;
    }

    public void setVlDesp(BigDecimal vlDesp) {
        this.vlDesp = vlDesp;
    }

    public BigDecimal getVlPedg() {
        return vlPedg;
    }

    public void setVlPedg(BigDecimal vlPedg) {
        this.vlPedg = vlPedg;
    }

    public BigDecimal getVlOut() {
        return vlOut;
    }

    public void setVlOut(BigDecimal vlOut) {
        this.vlOut = vlOut;
    }

    public BigDecimal getVlFrt() {
        return vlFrt;
    }

    public void setVlFrt(BigDecimal vlFrt) {
        this.vlFrt = vlFrt;
    }

    public String getUfId() {
        return ufId;
    }

    public void setUfId(String ufId) {
        this.ufId = ufId;
    }
    
}
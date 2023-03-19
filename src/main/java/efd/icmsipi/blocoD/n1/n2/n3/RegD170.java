package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegD170 implements Serializable {
	private static final long serialVersionUID = 2773291284651978022L;

	@Inclui
    private final String reg = "D170";

    @Inclui
    private String codPartConsg;

    @Inclui
    private String codPartRed;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Inclui
    private String otm;

    @Inclui
    private String indNatFrt;

    @Inclui
    private BigDecimal vlLiqFrt;

    @Inclui
    private BigDecimal vlGris;

    @Inclui
    private BigDecimal vlPdg;

    @Inclui
    private BigDecimal vlOut;

    @Inclui
    private BigDecimal vlFrt;

    @Inclui
    private String veicId;

    @Inclui
    private String ufId;

    public RegD170(String codPartConsg, String codPartRed, Integer codMunOrig, Integer codMunDest, String otm, String indNatFrt, BigDecimal vlLiqFrt, BigDecimal vlGris, BigDecimal vlPdg, BigDecimal vlOut, BigDecimal vlFrt, String veicId, String ufId) {
        this.codPartConsg = codPartConsg;
        this.codPartRed = codPartRed;
        this.codMunOrig = codMunOrig;
        this.codMunDest = codMunDest;
        this.otm = otm;
        this.indNatFrt = indNatFrt;
        this.vlLiqFrt = vlLiqFrt;
        this.vlGris = vlGris;
        this.vlPdg = vlPdg;
        this.vlOut = vlOut;
        this.vlFrt = vlFrt;
        this.veicId = veicId;
        this.ufId = ufId;
    }

    public RegD170(){}

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

    public String getOtm() {
        return otm;
    }

    public void setOtm(String otm) {
        this.otm = otm;
    }

    public String getIndNatFrt() {
        return indNatFrt;
    }

    public void setIndNatFrt(String indNatFrt) {
        this.indNatFrt = indNatFrt;
    }

    public BigDecimal getVlLiqFrt() {
        return vlLiqFrt;
    }

    public void setVlLiqFrt(BigDecimal vlLiqFrt) {
        this.vlLiqFrt = vlLiqFrt;
    }

    public BigDecimal getVlGris() {
        return vlGris;
    }

    public void setVlGris(BigDecimal vlGris) {
        this.vlGris = vlGris;
    }

    public BigDecimal getVlPdg() {
        return vlPdg;
    }

    public void setVlPdg(BigDecimal vlPdg) {
        this.vlPdg = vlPdg;
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

    public String getVeicId() {
        return veicId;
    }

    public void setVeicId(String veicId) {
        this.veicId = veicId;
    }

    public String getUfId() {
        return ufId;
    }

    public void setUfId(String ufId) {
        this.ufId = ufId;
    }
    
}
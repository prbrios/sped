package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegD150 implements Serializable {
	private static final long serialVersionUID = 1287383366029144731L;

	@Inclui
    private final String reg = "D150";

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Inclui
    private String veicId;

    @Inclui
    private Integer viagem;

    @Inclui
    private String indTfa;

    @Inclui
    private BigDecimal vlPesoTx;

    @Inclui
    private BigDecimal vlTxTerr;

    @Inclui
    private BigDecimal vlTxRed;

    @Inclui
    private BigDecimal vlOut;

    @Inclui
    private BigDecimal vlTxAdv;

    public RegD150(Integer codMunOrig, Integer codMunDest, String veicId, Integer viagem, String indTfa, BigDecimal vlPesoTx, BigDecimal vlTxTerr, BigDecimal vlTxRed, BigDecimal vlOut, BigDecimal vlTxAdv) {
        this.codMunOrig = codMunOrig;
        this.codMunDest = codMunDest;
        this.veicId = veicId;
        this.viagem = viagem;
        this.indTfa = indTfa;
        this.vlPesoTx = vlPesoTx;
        this.vlTxTerr = vlTxTerr;
        this.vlTxRed = vlTxRed;
        this.vlOut = vlOut;
        this.vlTxAdv = vlTxAdv;
    }

    public RegD150(){}

    public String getReg() {
        return reg;
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

    public Integer getViagem() {
        return viagem;
    }

    public void setViagem(Integer viagem) {
        this.viagem = viagem;
    }

    public String getIndTfa() {
        return indTfa;
    }

    public void setIndTfa(String indTfa) {
        this.indTfa = indTfa;
    }

    public BigDecimal getVlPesoTx() {
        return vlPesoTx;
    }

    public void setVlPesoTx(BigDecimal vlPesoTx) {
        this.vlPesoTx = vlPesoTx;
    }

    public BigDecimal getVlTxTerr() {
        return vlTxTerr;
    }

    public void setVlTxTerr(BigDecimal vlTxTerr) {
        this.vlTxTerr = vlTxTerr;
    }

    public BigDecimal getVlTxRed() {
        return vlTxRed;
    }

    public void setVlTxRed(BigDecimal vlTxRed) {
        this.vlTxRed = vlTxRed;
    }

    public BigDecimal getVlOut() {
        return vlOut;
    }

    public void setVlOut(BigDecimal vlOut) {
        this.vlOut = vlOut;
    }

    public BigDecimal getVlTxAdv() {
        return vlTxAdv;
    }

    public void setVlTxAdv(BigDecimal vlTxAdv) {
        this.vlTxAdv = vlTxAdv;
    }
    
}
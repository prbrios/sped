package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegD140 implements Serializable {
	private static final long serialVersionUID = 4138749034311922144L;

	@Inclui
    private final String reg = "D140";

    @Inclui
    private String codPartConsg;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunOrig;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunDest;

    @Inclui
    private String indVeic;

    @Inclui
    private String veicId;

    @Inclui
    private String indNav;

    @Inclui
    private Integer viagem;

    @Inclui
    private BigDecimal vlFrtLiq;

    @Inclui
    private BigDecimal vlDespPort;

    @Inclui
    private BigDecimal vlDespCarDesc;

    @Inclui
    private BigDecimal vlOut;

    @Inclui
    private BigDecimal vlfrtBr;

    @Inclui
    private BigDecimal vlFrtMm;

    public RegD140(String codPartConsg, Integer codMunOrig, Integer codMunDest, String indVeic, String veicId, String indNav, Integer viagem, BigDecimal vlFrtLiq, BigDecimal vlDespPort, BigDecimal vlDespCarDesc, BigDecimal vlOut, BigDecimal vlfrtBr, BigDecimal vlFrtMm) {
        this.codPartConsg = codPartConsg;
        this.codMunOrig = codMunOrig;
        this.codMunDest = codMunDest;
        this.indVeic = indVeic;
        this.veicId = veicId;
        this.indNav = indNav;
        this.viagem = viagem;
        this.vlFrtLiq = vlFrtLiq;
        this.vlDespPort = vlDespPort;
        this.vlDespCarDesc = vlDespCarDesc;
        this.vlOut = vlOut;
        this.vlfrtBr = vlfrtBr;
        this.vlFrtMm = vlFrtMm;
    }

    public RegD140(){}

    public String getReg() {
        return reg;
    }

    public String getCodPartConsg() {
        return codPartConsg;
    }

    public void setCodPartConsg(String codPartConsg) {
        this.codPartConsg = codPartConsg;
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

    public String getIndVeic() {
        return indVeic;
    }

    public void setIndVeic(String indVeic) {
        this.indVeic = indVeic;
    }

    public String getVeicId() {
        return veicId;
    }

    public void setVeicId(String veicId) {
        this.veicId = veicId;
    }

    public String getIndNav() {
        return indNav;
    }

    public void setIndNav(String indNav) {
        this.indNav = indNav;
    }

    public Integer getViagem() {
        return viagem;
    }

    public void setViagem(Integer viagem) {
        this.viagem = viagem;
    }

    public BigDecimal getVlFrtLiq() {
        return vlFrtLiq;
    }

    public void setVlFrtLiq(BigDecimal vlFrtLiq) {
        this.vlFrtLiq = vlFrtLiq;
    }

    public BigDecimal getVlDespPort() {
        return vlDespPort;
    }

    public void setVlDespPort(BigDecimal vlDespPort) {
        this.vlDespPort = vlDespPort;
    }

    public BigDecimal getVlDespCarDesc() {
        return vlDespCarDesc;
    }

    public void setVlDespCarDesc(BigDecimal vlDespCarDesc) {
        this.vlDespCarDesc = vlDespCarDesc;
    }

    public BigDecimal getVlOut() {
        return vlOut;
    }

    public void setVlOut(BigDecimal vlOut) {
        this.vlOut = vlOut;
    }

    public BigDecimal getVlfrtBr() {
        return vlfrtBr;
    }

    public void setVlfrtBr(BigDecimal vlfrtBr) {
        this.vlfrtBr = vlfrtBr;
    }

    public BigDecimal getVlFrtMm() {
        return vlFrtMm;
    }

    public void setVlFrtMm(BigDecimal vlFrtMm) {
        this.vlFrtMm = vlFrtMm;
    }
    
}
package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC495 implements Serializable {
	private static final long serialVersionUID = 3633147605077959226L;

	@Inclui
    private final String reg = "C495";

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtdCanc;

    @Inclui
    private String unid;

    @Inclui
    private BigDecimal vlItem;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlCanc;

    @Inclui
    private BigDecimal vlAcmo;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal clIcms;

    @Inclui
    private BigDecimal vlIsen;

    @Inclui
    private BigDecimal vlNt;

    @Inclui
    private BigDecimal vlIcmsSt;

    public RegC495(BigDecimal aliqIcms, String codItem, BigDecimal qtd, BigDecimal qtdCanc, String unid, BigDecimal vlItem, BigDecimal vlDesc, BigDecimal vlCanc, BigDecimal vlAcmo, BigDecimal vlBcIcms, BigDecimal clIcms, BigDecimal vlIsen, BigDecimal vlNt, BigDecimal vlIcmsSt) {
        this.aliqIcms = aliqIcms;
        this.codItem = codItem;
        this.qtd = qtd;
        this.qtdCanc = qtdCanc;
        this.unid = unid;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
        this.vlCanc = vlCanc;
        this.vlAcmo = vlAcmo;
        this.vlBcIcms = vlBcIcms;
        this.clIcms = clIcms;
        this.vlIsen = vlIsen;
        this.vlNt = vlNt;
        this.vlIcmsSt = vlIcmsSt;
    }

    public RegC495(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public BigDecimal getQtdCanc() {
        return qtdCanc;
    }

    public void setQtdCanc(BigDecimal qtdCanc) {
        this.qtdCanc = qtdCanc;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getVlItem() {
        return vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public BigDecimal getVlCanc() {
        return vlCanc;
    }

    public void setVlCanc(BigDecimal vlCanc) {
        this.vlCanc = vlCanc;
    }

    public BigDecimal getVlAcmo() {
        return vlAcmo;
    }

    public void setVlAcmo(BigDecimal vlAcmo) {
        this.vlAcmo = vlAcmo;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getClIcms() {
        return clIcms;
    }

    public void setClIcms(BigDecimal clIcms) {
        this.clIcms = clIcms;
    }

    public BigDecimal getVlIsen() {
        return vlIsen;
    }

    public void setVlIsen(BigDecimal vlIsen) {
        this.vlIsen = vlIsen;
    }

    public BigDecimal getVlNt() {
        return vlNt;
    }

    public void setVlNt(BigDecimal vlNt) {
        this.vlNt = vlNt;
    }

    public BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }
    
}
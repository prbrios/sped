package efd.icmsipi.blocoG.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegG140 implements Serializable {
	private static final long serialVersionUID = 1607066260672879951L;

	@Inclui
    private final String reg = "G140";

    @Inclui
    private Integer numItem;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 5)
    private BigDecimal qtde;

    @Inclui
    private String unid;

    @Inclui
    private BigDecimal vlIcmsOpAplicado;

    @Inclui
    private BigDecimal vlIcmsStAplicado;

    @Inclui
    private BigDecimal vlIcmsFrtAplicado;

    @Inclui
    private BigDecimal vlIcmsDifAplicado;

    public RegG140(Integer numItem, String codItem, BigDecimal qtde, String unid, BigDecimal vlIcmsOpAplicado, BigDecimal vlIcmsStAplicado, BigDecimal vlIcmsFrtAplicado, BigDecimal vlIcmsDifAplicado) {
        this.numItem = numItem;
        this.codItem = codItem;
        this.qtde = qtde;
        this.unid = unid;
        this.vlIcmsOpAplicado = vlIcmsOpAplicado;
        this.vlIcmsStAplicado = vlIcmsStAplicado;
        this.vlIcmsFrtAplicado = vlIcmsFrtAplicado;
        this.vlIcmsDifAplicado = vlIcmsDifAplicado;
    }

    public RegG140(){}

    public String getReg() {
        return reg;
    }

    public Integer getNumItem() {
        return numItem;
    }

    public void setNumItem(Integer numItem) {
        this.numItem = numItem;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtde() {
        return qtde;
    }

    public void setQtde(BigDecimal qtde) {
        this.qtde = qtde;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getVlIcmsOpAplicado() {
        return vlIcmsOpAplicado;
    }

    public void setVlIcmsOpAplicado(BigDecimal vlIcmsOpAplicado) {
        this.vlIcmsOpAplicado = vlIcmsOpAplicado;
    }

    public BigDecimal getVlIcmsStAplicado() {
        return vlIcmsStAplicado;
    }

    public void setVlIcmsStAplicado(BigDecimal vlIcmsStAplicado) {
        this.vlIcmsStAplicado = vlIcmsStAplicado;
    }

    public BigDecimal getVlIcmsFrtAplicado() {
        return vlIcmsFrtAplicado;
    }

    public void setVlIcmsFrtAplicado(BigDecimal vlIcmsFrtAplicado) {
        this.vlIcmsFrtAplicado = vlIcmsFrtAplicado;
    }

    public BigDecimal getVlIcmsDifAplicado() {
        return vlIcmsDifAplicado;
    }

    public void setVlIcmsDifAplicado(BigDecimal vlIcmsDifAplicado) {
        this.vlIcmsDifAplicado = vlIcmsDifAplicado;
    }
    
}
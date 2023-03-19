package efd.icmsipi.blocoC.n1.n2.n3.n4.n5;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.n5.n6.RegC480;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC470 implements Serializable {
	private static final long serialVersionUID = 2492739079819582794L;

	@Inclui
    private final String reg = "C470";

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

    @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Filho
    private RegC480 regC480;

    public RegC470(String codItem, BigDecimal qtd, BigDecimal qtdCanc, String unid, BigDecimal vlItem, Integer cstIcms, Integer cfop, BigDecimal aliqIcms, BigDecimal vlPis, BigDecimal vlCofins) {
        this.codItem = codItem;
        this.qtd = qtd;
        this.qtdCanc = qtdCanc;
        this.unid = unid;
        this.vlItem = vlItem;
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.aliqIcms = aliqIcms;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
    }

    public RegC470(){}

    public String getReg() {
        return reg;
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

    public Integer getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(Integer cstIcms) {
        this.cstIcms = cstIcms;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public RegC480 getRegC480() {
        return regC480;
    }

    public void setRegC480(RegC480 regC480) {
        this.regC480 = regC480;
    }
    
}
package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC195 implements Serializable {
	private static final long serialVersionUID = 6775973712389476460L;

	@Inclui
	private final String reg = "C195";

    @Inclui
    private String cnpjCpfPart;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private BigDecimal vlItem;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofinsQuant;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private BigDecimal codCta;

    public RegC195(String cnpjCpfPart, Integer cstCofins, Integer cfop, BigDecimal vlItem, BigDecimal vlDesc, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal quantBcCofins, BigDecimal aliqCofinsQuant, BigDecimal vlCofins, BigDecimal codCta) {
        this.cnpjCpfPart = cnpjCpfPart;
        this.cstCofins = cstCofins;
        this.cfop = cfop;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.quantBcCofins = quantBcCofins;
        this.aliqCofinsQuant = aliqCofinsQuant;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
    }

    public RegC195(){ }

    public String getReg() {
        return reg;
    }

    public String getCnpjCpfPart() {
        return cnpjCpfPart;
    }

    public void setCnpjCpfPart(String cnpjCpfPart) {
        this.cnpjCpfPart = cnpjCpfPart;
    }

    public Integer getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(Integer cstCofins) {
        this.cstCofins = cstCofins;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
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

    public BigDecimal getVlBcCofins() {
        return vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }

    public BigDecimal getAliqCofins() {
        return aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }

    public BigDecimal getQuantBcCofins() {
        return quantBcCofins;
    }

    public void setQuantBcCofins(BigDecimal quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }

    public BigDecimal getAliqCofinsQuant() {
        return aliqCofinsQuant;
    }

    public void setAliqCofinsQuant(BigDecimal aliqCofinsQuant) {
        this.aliqCofinsQuant = aliqCofinsQuant;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public BigDecimal getCodCta() {
        return codCta;
    }

    public void setCodCta(BigDecimal codCta) {
        this.codCta = codCta;
    }
    

}

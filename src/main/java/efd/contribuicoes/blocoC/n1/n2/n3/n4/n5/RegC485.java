package efd.contribuicoes.blocoC.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC485 implements Serializable {
	private static final long serialVersionUID = 6814447749405607001L;

	@Inclui
	private final String reg = "C485";

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui
    private BigDecimal vlItem;

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
    private String codItem;

    @Inclui
    private String codCta;

    public RegC485(Integer cstCofins, BigDecimal vlItem, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal quantBcCofins, BigDecimal aliqCofinsQuant, BigDecimal vlCofins, String codItem, String codCta) {
        this.cstCofins = cstCofins;
        this.vlItem = vlItem;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.quantBcCofins = quantBcCofins;
        this.aliqCofinsQuant = aliqCofinsQuant;
        this.vlCofins = vlCofins;
        this.codItem = codItem;
        this.codCta = codCta;
    }

    public RegC485(){ }

    public String getReg() {
        return reg;
    }

    public Integer getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(Integer cstCofins) {
        this.cstCofins = cstCofins;
    }

    public BigDecimal getVlItem() {
        return vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
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

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
}

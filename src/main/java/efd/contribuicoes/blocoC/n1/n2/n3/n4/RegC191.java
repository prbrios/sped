package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC191 implements Serializable {
	private static final long serialVersionUID = -1084855109225905582L;

	@Inclui
	private final String reg = "C191";

    @Inclui
    private String cnpjCpfPart;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private BigDecimal vlItem;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPisQuant;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal codCta;

    public RegC191(String cnpjCpfPart, Integer cstPis, Integer cfop, BigDecimal vlItem, BigDecimal vlDesc, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal quantBcPis, BigDecimal aliqPisQuant, BigDecimal vlPis, BigDecimal codCta) {
        this.cnpjCpfPart = cnpjCpfPart;
        this.cstPis = cstPis;
        this.cfop = cfop;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.quantBcPis = quantBcPis;
        this.aliqPisQuant = aliqPisQuant;
        this.vlPis = vlPis;
        this.codCta = codCta;
    }

    public RegC191(){}

    public String getReg() {
        return reg;
    }

    public String getCnpjCpfPart() {
        return cnpjCpfPart;
    }

    public void setCnpjCpfPart(String cnpjCpfPart) {
        this.cnpjCpfPart = cnpjCpfPart;
    }

    public Integer getCstPis() {
        return cstPis;
    }

    public void setCstPis(Integer cstPis) {
        this.cstPis = cstPis;
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

    public BigDecimal getVlBcPis() {
        return vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }

    public BigDecimal getAliqPis() {
        return aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }

    public BigDecimal getQuantBcPis() {
        return quantBcPis;
    }

    public void setQuantBcPis(BigDecimal quantBcPis) {
        this.quantBcPis = quantBcPis;
    }

    public BigDecimal getAliqPisQuant() {
        return aliqPisQuant;
    }

    public void setAliqPisQuant(BigDecimal aliqPisQuant) {
        this.aliqPisQuant = aliqPisQuant;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getCodCta() {
        return codCta;
    }

    public void setCodCta(BigDecimal codCta) {
        this.codCta = codCta;
    }
    

}

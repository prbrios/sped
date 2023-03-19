package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC815;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC810 implements Serializable {
	private static final long serialVersionUID = -7656549448590721618L;

	@Inclui
	private final String reg = "C810";

	@Inclui
	private Integer numItem;

	@Inclui
	private String codItem;

	@Inclui(casasDecimais = 5)
	private BigDecimal qtd;

	@Inclui
	private String unid;

	@Inclui
	private BigDecimal vlItem;

	@Inclui(zerosEsquerda = 3)
	private Integer cstIcms;

	@Inclui(zerosEsquerda = 4)
	private Integer cfop;

	@Filho
	private RegC815 regC815;

	public RegC810(Integer numItem, String codItem, BigDecimal qtd, String unid, BigDecimal vlItem, Integer cstIcms, Integer cfop) {
		this.numItem = numItem;
		this.codItem = codItem;
		this.qtd = qtd;
		this.unid = unid;
		this.vlItem = vlItem;
		this.cstIcms = cstIcms;
		this.cfop = cfop;
	}

	public RegC810(){}

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

	public BigDecimal getQtd() {
		return qtd;
	}

	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
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

	public RegC815 getRegC815() {
		return regC815;
	}

	public void setRegC815(RegC815 regC815) {
		this.regC815 = regC815;
	}
	

}

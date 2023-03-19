package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC880;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC870 implements Serializable {
	private static final long serialVersionUID = 7972959099278252893L;

	@Inclui
	private final String reg = "C870";

	@Inclui
	private String codItem;

	@Inclui(casasDecimais = 5)
	private BigDecimal qtd;

	@Inclui
	private String unid;

	@Inclui(zerosEsquerda = 3)
	private Integer cstIcms;

	@Inclui(zerosEsquerda = 4)
	private Integer cfop;

	@Filho
	private RegC880 regC880;

	public RegC870(String codItem, BigDecimal qtd, String unid, Integer cstIcms, Integer cfop) {
		this.codItem = codItem;
		this.qtd = qtd;
		this.unid = unid;
		this.cstIcms = cstIcms;
		this.cfop = cfop;
	}

	public RegC870(){}

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

	public String getUnid() {
		return unid;
	}

	public void setUnid(String unid) {
		this.unid = unid;
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

	public RegC880 getRegC880() {
		return regC880;
	}

	public void setRegC880(RegC880 regC880) {
		this.regC880 = regC880;
	}
	

}

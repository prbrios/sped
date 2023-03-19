package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC597 implements Serializable {
	private static final long serialVersionUID = -7997889146569630861L;

	@Inclui
	private final String reg = "C597";

	@Inclui
	private String codAj;

	@Inclui
	private String descrComplaj;

	@Inclui
	private String codItem;

	@Inclui(casasDecimais = 2)
	private BigDecimal vlBcIcms;

	@Inclui(casasDecimais = 2)
	private BigDecimal aliqIcms;

	@Inclui(casasDecimais = 2)
	private BigDecimal vlIcms;

	@Inclui(casasDecimais = 2)
	private BigDecimal vlOutros;

	public RegC597(String codAj, String descrComplaj, String codItem, BigDecimal vlBcIcms, BigDecimal aliqIcms, BigDecimal vlIcms, BigDecimal vlOutros) {
		this.codAj = codAj;
		this.descrComplaj = descrComplaj;
		this.codItem = codItem;
		this.vlBcIcms = vlBcIcms;
		this.aliqIcms = aliqIcms;
		this.vlIcms = vlIcms;
		this.vlOutros = vlOutros;
	}

	public RegC597(){}

	public String getReg() {
		return reg;
	}

	public String getCodAj() {
		return codAj;
	}

	public void setCodAj(String codAj) {
		this.codAj = codAj;
	}

	public String getDescrComplaj() {
		return descrComplaj;
	}

	public void setDescrComplaj(String descrComplaj) {
		this.descrComplaj = descrComplaj;
	}

	public String getCodItem() {
		return codItem;
	}

	public void setCodItem(String codItem) {
		this.codItem = codItem;
	}

	public BigDecimal getVlBcIcms() {
		return vlBcIcms;
	}

	public void setVlBcIcms(BigDecimal vlBcIcms) {
		this.vlBcIcms = vlBcIcms;
	}

	public BigDecimal getAliqIcms() {
		return aliqIcms;
	}

	public void setAliqIcms(BigDecimal aliqIcms) {
		this.aliqIcms = aliqIcms;
	}

	public BigDecimal getVlIcms() {
		return vlIcms;
	}

	public void setVlIcms(BigDecimal vlIcms) {
		this.vlIcms = vlIcms;
	}

	public BigDecimal getVlOutros() {
		return vlOutros;
	}

	public void setVlOutros(BigDecimal vlOutros) {
		this.vlOutros = vlOutros;
	}
	
}

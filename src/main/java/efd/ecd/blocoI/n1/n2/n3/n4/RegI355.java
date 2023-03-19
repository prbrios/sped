package efd.ecd.blocoI.n1.n2.n3.n4;

import java.io.Serializable;
import java.math.BigDecimal;

import efd.anotacoes.Inclui;

public class RegI355 implements Serializable {
	private static final long serialVersionUID = -2724466843738236549L;

	@Inclui
	private final String reg = "I355";
	
	@Inclui
	private String codCta;
	
	@Inclui
	private String codCcus;
	
	@Inclui
	private BigDecimal vlCta;
	
	@Inclui
	private String indDc;
	
	@Inclui
	private BigDecimal vlCtaMf;
	
	@Inclui
	private String indDcMf;
	
	public RegI355(String codCta, String codCcus, BigDecimal vlCta, String indDc, BigDecimal vlCtaMf, String indDcMf) {
		super();
		this.codCta = codCta;
		this.codCcus = codCcus;
		this.vlCta = vlCta;
		this.indDc = indDc;
		this.vlCtaMf = vlCtaMf;
		this.indDcMf = indDcMf;
	}
	
	public RegI355() {/* */}

	public String getReg() {
		return reg;
	}

	public String getCodCta() {
		return codCta;
	}

	public void setCodCta(String codCta) {
		this.codCta = codCta;
	}

	public String getCodCcus() {
		return codCcus;
	}

	public void setCodCcus(String codCcus) {
		this.codCcus = codCcus;
	}

	public BigDecimal getVlCta() {
		return vlCta;
	}

	public void setVlCta(BigDecimal vlCta) {
		this.vlCta = vlCta;
	}

	public String getIndDc() {
		return indDc;
	}

	public void setIndDc(String indDc) {
		this.indDc = indDc;
	}

	public BigDecimal getVlCtaMf() {
		return vlCtaMf;
	}

	public void setVlCtaMf(BigDecimal vlCtaMf) {
		this.vlCtaMf = vlCtaMf;
	}

	public String getIndDcMf() {
		return indDcMf;
	}

	public void setIndDcMf(String indDcMf) {
		this.indDcMf = indDcMf;
	}
	

}

package efd.ecd.blocoI.n1.n2.n3.n4.n5;

import java.io.Serializable;
import java.math.BigDecimal;

import efd.anotacoes.Inclui;

public class RegI157 implements Serializable {
	private static final long serialVersionUID = 7056029078592600270L;

	@Inclui
	private final String reg = "I157";
	
	@Inclui
	private String codCta;
	
	@Inclui
	private String codCcus;
	
	@Inclui
	private BigDecimal vlSldIni;
	
	@Inclui
	private String indDcIni;
	
	@Inclui
	private BigDecimal vlSldIniMf;
	
	@Inclui
	private String indDcIniMf;

	public RegI157(String codCta, String codCcus, BigDecimal vlSldIni, String indDcIni, BigDecimal vlSldIniMf,
			String indDcIniMf) {
		super();
		this.codCta = codCta;
		this.codCcus = codCcus;
		this.vlSldIni = vlSldIni;
		this.indDcIni = indDcIni;
		this.vlSldIniMf = vlSldIniMf;
		this.indDcIniMf = indDcIniMf;
	}
	
	public RegI157() {/**/}

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

	public BigDecimal getVlSldIni() {
		return vlSldIni;
	}

	public void setVlSldIni(BigDecimal vlSldIni) {
		this.vlSldIni = vlSldIni;
	}

	public String getIndDcIni() {
		return indDcIni;
	}

	public void setIndDcIni(String indDcIni) {
		this.indDcIni = indDcIni;
	}

	public BigDecimal getVlSldIniMf() {
		return vlSldIniMf;
	}

	public void setVlSldIniMf(BigDecimal vlSldIniMf) {
		this.vlSldIniMf = vlSldIniMf;
	}

	public String getIndDcIniMf() {
		return indDcIniMf;
	}

	public void setIndDcIniMf(String indDcIniMf) {
		this.indDcIniMf = indDcIniMf;
	}
	
	
}

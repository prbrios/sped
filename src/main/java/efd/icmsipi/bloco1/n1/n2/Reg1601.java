package efd.icmsipi.bloco1.n1.n2;

import java.io.Serializable;
import java.math.BigDecimal;

import efd.anotacoes.Inclui;

public class Reg1601 implements Serializable {
	private static final long serialVersionUID = 3865132148206629523L;

	@Inclui
    private final String reg = "1601";

	@Inclui
	private String codPartIp;

	@Inclui
	private String codPartIt;

	@Inclui(casasDecimais = 2)
	private BigDecimal totVs;

	@Inclui(casasDecimais = 2)
	private BigDecimal totIss;

	@Inclui(casasDecimais = 2)
	private BigDecimal totOutros;

	public Reg1601(String codPartIp, String codPartIt, BigDecimal totVs, BigDecimal totIss, BigDecimal totOutros) {
		this.codPartIp = codPartIp;
		this.codPartIt = codPartIt;
		this.totVs = totVs;
		this.totIss = totIss;
		this.totOutros = totOutros;
	}

	public Reg1601() {}

	public String getReg() {
		return reg;
	}

	public String getCodPartIp() {
		return codPartIp;
	}

	public void setCodPartIp(String codPartIp) {
		this.codPartIp = codPartIp;
	}

	public String getCodPartIt() {
		return codPartIt;
	}

	public void setCodPartIt(String codPartIt) {
		this.codPartIt = codPartIt;
	}

	public BigDecimal getTotVs() {
		return totVs;
	}

	public void setTotVs(BigDecimal totVs) {
		this.totVs = totVs;
	}

	public BigDecimal getTotIss() {
		return totIss;
	}

	public void setTotIss(BigDecimal totIss) {
		this.totIss = totIss;
	}

	public BigDecimal getTotOutros() {
		return totOutros;
	}

	public void setTotOutros(BigDecimal totOutros) {
		this.totOutros = totOutros;
	}
	
	
}

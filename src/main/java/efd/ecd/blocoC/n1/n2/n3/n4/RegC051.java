package efd.ecd.blocoC.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegC051 implements Serializable {
	private static final long serialVersionUID = -1531715344153453183L;

	@Inclui
	private final String reg = "C051";
	
	@Inclui
	private String codCcus;
	
	@Inclui
	private String codCtaRef;

	public RegC051(String codCcus, String codCtaRef) {
		super();
		this.codCcus = codCcus;
		this.codCtaRef = codCtaRef;
	}
	
	public RegC051() {/* */}

	public String getReg() {
		return reg;
	}

	public String getCodCcus() {
		return codCcus;
	}

	public void setCodCcus(String codCcus) {
		this.codCcus = codCcus;
	}

	public String getCodCtaRef() {
		return codCtaRef;
	}

	public void setCodCtaRef(String codCtaRef) {
		this.codCtaRef = codCtaRef;
	}
	
	
}

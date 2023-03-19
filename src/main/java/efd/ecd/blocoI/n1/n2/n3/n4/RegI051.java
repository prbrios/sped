package efd.ecd.blocoI.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegI051 implements Serializable {
	private static final long serialVersionUID = 1822008726603847429L;

	@Inclui
	private final String reg = "I051";
	
	@Inclui
	private String codCcus;
	
	@Inclui
	private String codCtaRef;
	
	public RegI051(String codCcus, String codCtaRef) {
		super();
		this.codCcus = codCcus;
		this.codCtaRef = codCtaRef;
	}
	
	public RegI051() {/* */}

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

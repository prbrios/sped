package efd.ecd.blocoI.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegI052 implements Serializable {
	private static final long serialVersionUID = 3287263886108763795L;

	@Inclui
	private final String reg = "I052";
	
	@Inclui
	private String codCcus;
	
	@Inclui
	private String codAgl;
	
	public RegI052(String codCcus, String codAgl) {
		super();
		this.codCcus = codCcus;
		this.codAgl = codAgl;
	}
	
	public RegI052() {/* */}

	public String getReg() {
		return reg;
	}

	public String getCodCcus() {
		return codCcus;
	}

	public void setCodCcus(String codCcus) {
		this.codCcus = codCcus;
	}

	public String getCodAgl() {
		return codAgl;
	}

	public void setCodAgl(String codAgl) {
		this.codAgl = codAgl;
	}
	
	
}

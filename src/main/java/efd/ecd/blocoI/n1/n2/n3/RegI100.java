package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;
import java.time.LocalDate;

import efd.anotacoes.Inclui;

public class RegI100 implements Serializable {
	private static final long serialVersionUID = -5766357141432391425L;

	@Inclui
	private final String reg = "I100";
	
	@Inclui
	private LocalDate dtAlt;
	
	@Inclui
	private String codCcus;
	
	@Inclui
	private String ccus;
	
	public RegI100(LocalDate dtAlt, String codCcus, String ccus) {
		super();
		this.dtAlt = dtAlt;
		this.codCcus = codCcus;
		this.ccus = ccus;
	}
	
	public RegI100() {/* */}

	public String getReg() {
		return reg;
	}

	public LocalDate getDtAlt() {
		return dtAlt;
	}

	public void setDtAlt(LocalDate dtAlt) {
		this.dtAlt = dtAlt;
	}

	public String getCodCcus() {
		return codCcus;
	}

	public void setCodCcus(String codCcus) {
		this.codCcus = codCcus;
	}

	public String getCcus() {
		return ccus;
	}

	public void setCcus(String ccus) {
		this.ccus = ccus;
	}
	
	
}

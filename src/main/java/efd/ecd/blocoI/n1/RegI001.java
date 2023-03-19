package efd.ecd.blocoI.n1;

import java.io.Serializable;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.RegI010;

public class RegI001 implements Serializable {
	private static final long serialVersionUID = 9183954725279782397L;

	@Inclui
	private final String reg = "I001";
	
	@Inclui
	private Integer indDad;

	@Filho
	private RegI010 regI010;
	
	public RegI001(Integer indDad) {
		super();
		this.indDad = indDad;
	}
	
	public RegI001() {/* */}

	public String getReg() {
		return reg;
	}

	public Integer getIndDad() {
		return indDad;
	}

	public void setIndDad(Integer indDad) {
		this.indDad = indDad;
	}

	public RegI010 getRegI010() {
		return regI010;
	}

	public void setRegI010(RegI010 regI010) {
		this.regI010 = regI010;
	}
	
	
}

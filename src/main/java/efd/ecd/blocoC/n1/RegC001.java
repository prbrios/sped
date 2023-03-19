package efd.ecd.blocoC.n1;

import java.io.Serializable;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoC.n1.n2.RegC040;

public class RegC001 implements Serializable {
	private static final long serialVersionUID = -1331502149747724043L;

	@Inclui
	public final String reg = "C001";
	
	@Inclui
	private Integer indDad;
	
	@Inclui @Filho
	private RegC040 regC040;

	public RegC001(Integer indDad) {
		super();
		this.indDad = indDad;
	}
	
	public RegC001() {/* */}

	public String getReg() {
		return reg;
	}

	public Integer getIndDad() {
		return indDad;
	}

	public void setIndDad(Integer indDad) {
		this.indDad = indDad;
	}

	public RegC040 getRegC040() {
		return regC040;
	}

	public void setRegC040(RegC040 regC040) {
		this.regC040 = regC040;
	}
	

}

package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegI500 implements Serializable {
	private static final long serialVersionUID = 821988277631033701L;

	@Inclui
	private final String reg = "I500";
	
	@Inclui
	private Integer tamFonte;

	public RegI500(Integer tamFonte) {
		super();
		this.tamFonte = tamFonte;
	}
	
	public RegI500() {/* */}

	public String getReg() {
		return reg;
	}

	public Integer getTamFonte() {
		return tamFonte;
	}

	public void setTamFonte(Integer tamFonte) {
		this.tamFonte = tamFonte;
	}
	
	
}

package efd.ecd.bloco0.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg0035 implements Serializable {
	private static final long serialVersionUID = -2267531652629660550L;

	@Inclui
	private final String reg = "0035";
	
	@Inclui
	private String codScp;
	
	@Inclui
	private String nomeScp;

	public Reg0035(String codScp, String nomeScp) {
		super();
		this.codScp = codScp;
		this.nomeScp = nomeScp;
	}
	
	public Reg0035() {/* */}

	public String getReg() {
		return reg;
	}

	public String getCodScp() {
		return codScp;
	}

	public void setCodScp(String codScp) {
		this.codScp = codScp;
	}

	public String getNomeScp() {
		return nomeScp;
	}

	public void setNomeScp(String nomeScp) {
		this.nomeScp = nomeScp;
	}
	
	
}

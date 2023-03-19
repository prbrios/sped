package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegI020 implements Serializable {
	private static final long serialVersionUID = 161050044760143814L;

	@Inclui
	private final String reg = "I020";
	
	@Inclui
	private String regCod;
	
	@Inclui
	private Integer numAd;
	
	@Inclui
	private String campo;
	
	@Inclui
	private String descricao;
	
	@Inclui
	private String tipo;
	
	public RegI020(String regCod, Integer numAd, String campo, String descricao, String tipo) {
		super();
		this.regCod = regCod;
		this.numAd = numAd;
		this.campo = campo;
		this.descricao = descricao;
		this.tipo = tipo;
	}
	
	public RegI020() {/* */}

	public String getReg() {
		return reg;
	}

	public String getRegCod() {
		return regCod;
	}

	public void setRegCod(String regCod) {
		this.regCod = regCod;
	}

	public Integer getNumAd() {
		return numAd;
	}

	public void setNumAd(Integer numAd) {
		this.numAd = numAd;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}

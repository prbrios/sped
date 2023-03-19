package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegI510 implements Serializable {
	private static final long serialVersionUID = -5568442348739517163L;

	@Inclui
	private final String reg = "I510";
	
	@Inclui
	private String nmCampo;
	
	@Inclui
	private String descCampo;
	
	@Inclui
	private String tipoCampo;
	
	@Inclui
	private Integer tamCampo;
	
	@Inclui
	private String decCampo;
	
	@Inclui
	private String colCampo;
	
	public RegI510(String nmCampo, String descCampo, String tipoCampo, Integer tamCampo, String decCampo,
			String colCampo) {
		super();
		this.nmCampo = nmCampo;
		this.descCampo = descCampo;
		this.tipoCampo = tipoCampo;
		this.tamCampo = tamCampo;
		this.decCampo = decCampo;
		this.colCampo = colCampo;
	}
	
	public RegI510() {/* */}

	public String getReg() {
		return reg;
	}

	public String getNmCampo() {
		return nmCampo;
	}

	public void setNmCampo(String nmCampo) {
		this.nmCampo = nmCampo;
	}

	public String getDescCampo() {
		return descCampo;
	}

	public void setDescCampo(String descCampo) {
		this.descCampo = descCampo;
	}

	public String getTipoCampo() {
		return tipoCampo;
	}

	public void setTipoCampo(String tipoCampo) {
		this.tipoCampo = tipoCampo;
	}

	public Integer getTamCampo() {
		return tamCampo;
	}

	public void setTamCampo(Integer tamCampo) {
		this.tamCampo = tamCampo;
	}

	public String getDecCampo() {
		return decCampo;
	}

	public void setDecCampo(String decCampo) {
		this.decCampo = decCampo;
	}

	public String getColCampo() {
		return colCampo;
	}

	public void setColCampo(String colCampo) {
		this.colCampo = colCampo;
	}
	
	
}

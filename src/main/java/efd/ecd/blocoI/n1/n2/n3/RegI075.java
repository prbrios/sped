package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegI075 implements Serializable {
	private static final long serialVersionUID = -4014361912805718556L;

	@Inclui
	private final String reg = "I075";
	
	@Inclui
	private String codHist;
	
	@Inclui
	private String descrHist;
	
	public RegI075(String codHist, String descrHist) {
		super();
		this.codHist = codHist;
		this.descrHist = descrHist;
	}
	
	public RegI075() {/* */}

	public String getReg() {
		return reg;
	}

	public String getCodHist() {
		return codHist;
	}

	public void setCodHist(String codHist) {
		this.codHist = codHist;
	}

	public String getDescrHist() {
		return descrHist;
	}

	public void setDescrHist(String descrHist) {
		this.descrHist = descrHist;
	}
	
	
}

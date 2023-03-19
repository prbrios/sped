package efd.ecd.blocoI.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegI053 implements Serializable {
	private static final long serialVersionUID = 2761420953732893732L;

	@Inclui
	private final String reg = "I053";
	
	@Inclui
	private String codIdt;
	
	@Inclui
	private String codCntCorr;
	
	@Inclui
	private String natSubCnt;
	
	public RegI053(String codIdt, String codCntCorr, String natSubCnt) {
		super();
		this.codIdt = codIdt;
		this.codCntCorr = codCntCorr;
		this.natSubCnt = natSubCnt;
	}
	
	public RegI053() {/* */}

	public String getReg() {
		return reg;
	}

	public String getCodIdt() {
		return codIdt;
	}

	public void setCodIdt(String codIdt) {
		this.codIdt = codIdt;
	}

	public String getCodCntCorr() {
		return codCntCorr;
	}

	public void setCodCntCorr(String codCntCorr) {
		this.codCntCorr = codCntCorr;
	}

	public String getNatSubCnt() {
		return natSubCnt;
	}

	public void setNatSubCnt(String natSubCnt) {
		this.natSubCnt = natSubCnt;
	}
	
	
}

package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI015;

public class RegI012 implements Serializable {
	private static final long serialVersionUID = -1911570533645632899L;

	@Inclui
	private final String reg = "I012";
	
	@Inclui
	private Integer numOrd;
	
	@Inclui
	private String natLivr;
	
	@Inclui
	private Integer tipo;
	
	@Inclui
	private String codHashAux;
	
	@Filho
	private List<RegI015> regI015;
	
	public RegI012(Integer numOrd, String natLivr, Integer tipo, String codHashAux) {
		super();
		this.numOrd = numOrd;
		this.natLivr = natLivr;
		this.tipo = tipo;
		this.codHashAux = codHashAux;
	}
	
	public RegI012() {/* */}

	public String getReg() {
		return reg;
	}

	public Integer getNumOrd() {
		return numOrd;
	}

	public void setNumOrd(Integer numOrd) {
		this.numOrd = numOrd;
	}

	public String getNatLivr() {
		return natLivr;
	}

	public void setNatLivr(String natLivr) {
		this.natLivr = natLivr;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getCodHashAux() {
		return codHashAux;
	}

	public void setCodHashAux(String codHashAux) {
		this.codHashAux = codHashAux;
	}

	public List<RegI015> getRegI015() {
		return regI015;
	}

	public void setRegI015(List<RegI015> regI015) {
		this.regI015 = regI015;
	}
	
	
}

package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI310;

public class RegI300 implements Serializable {
	private static final long serialVersionUID = -2123161974333809847L;

	@Inclui
	private final String reg = "I300";
	
	@Inclui
	private LocalDate dtBcte;

	@Filho
	private List<RegI310> regI310;
	
	public RegI300(LocalDate dtBcte) {
		super();
		this.dtBcte = dtBcte;
	}
	
	public RegI300() {/* */}

	public String getReg() {
		return reg;
	}

	public LocalDate getDtBcte() {
		return dtBcte;
	}

	public void setDtBcte(LocalDate dtBcte) {
		this.dtBcte = dtBcte;
	}

	public List<RegI310> getRegI310() {
		return regI310;
	}

	public void setRegI310(List<RegI310> regI310) {
		this.regI310 = regI310;
	}
	
	
}

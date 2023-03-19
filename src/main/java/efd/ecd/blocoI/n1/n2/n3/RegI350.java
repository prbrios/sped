package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI355;

public class RegI350 implements Serializable {
	private static final long serialVersionUID = 7103388484528623086L;

	@Inclui
	private final String reg = "I350";
	
	@Inclui
	private LocalDate dtRes;

	@Filho
	private List<RegI355> regI355;
	
	public RegI350(LocalDate dtRes) {
		super();
		this.dtRes = dtRes;
	}
	
	public RegI350() {/* */}

	public String getReg() {
		return reg;
	}

	public LocalDate getDtRes() {
		return dtRes;
	}

	public void setDtRes(LocalDate dtRes) {
		this.dtRes = dtRes;
	}

	public List<RegI355> getRegI355() {
		return regI355;
	}

	public void setRegI355(List<RegI355> regI355) {
		this.regI355 = regI355;
	}
	
	
}

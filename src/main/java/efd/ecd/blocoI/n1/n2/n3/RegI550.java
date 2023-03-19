package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI555;

public class RegI550 implements Serializable {
	private static final long serialVersionUID = -8211989967080704594L;

	@Inclui
	private final String reg = "I550";
	
	@Inclui
	private String rzCont;

	@Filho
	private List<RegI555> regI555;
	
	public RegI550(String rzCont) {
		super();
		this.rzCont = rzCont;
	}
	
	public RegI550() {/* */}

	public String getReg() {
		return reg;
	}

	public String getRzCont() {
		return rzCont;
	}

	public void setRzCont(String rzCont) {
		this.rzCont = rzCont;
	}

	public List<RegI555> getRegI555() {
		return regI555;
	}

	public void setRegI555(List<RegI555> regI555) {
		this.regI555 = regI555;
	}
	
	
}

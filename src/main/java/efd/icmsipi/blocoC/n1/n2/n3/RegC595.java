package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC597;

import java.io.Serializable;
import java.util.List;

public class RegC595 implements Serializable {
	private static final long serialVersionUID = 550355693885563338L;

	@Inclui
	private final String reg = "C595";

	@Inclui
	private String codObs;

	@Inclui
	private String txtCompl;

	@Filho
	private List<RegC597> regC597;

	public RegC595(String codObs, String txtCompl) {
		this.codObs = codObs;
		this.txtCompl = txtCompl;
	}

	public RegC595() {}

	public String getReg() {
		return reg;
	}

	public String getCodObs() {
		return codObs;
	}

	public void setCodObs(String codObs) {
		this.codObs = codObs;
	}

	public String getTxtCompl() {
		return txtCompl;
	}

	public void setTxtCompl(String txtCompl) {
		this.txtCompl = txtCompl;
	}

	public List<RegC597> getRegC597() {
		return regC597;
	}

	public void setRegC597(List<RegC597> regC597) {
		this.regC597 = regC597;
	}
	

}

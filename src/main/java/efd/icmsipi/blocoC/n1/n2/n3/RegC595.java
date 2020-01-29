package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC597;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class RegC595 {

	@Getter @Inclui
	private final String reg = "C595";

	@Getter @Setter @Inclui
	private String codObs;

	@Getter @Setter @Inclui
	private String txtCompl;

	@Getter @Setter @Filho
	private List<RegC597> regC597;

	public RegC595(String codObs, String txtCompl) {
		this.codObs = codObs;
		this.txtCompl = txtCompl;
	}

	public RegC595() {}

}

package efd.ecd.blocoC.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegC051 implements Serializable {
	private static final long serialVersionUID = -1531715344153453183L;

	@Getter @Inclui
	private final String reg = "C051";
	
	@Getter @Setter @Inclui
	private String codCcus;
	
	@Getter @Setter @Inclui
	private String codCtaRef;

	public RegC051(String codCcus, String codCtaRef) {
		super();
		this.codCcus = codCcus;
		this.codCtaRef = codCtaRef;
	}
	
	public RegC051() {/* */}
	
}

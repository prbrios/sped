package efd.ecd.blocoI.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI051 implements Serializable {
	private static final long serialVersionUID = 1822008726603847429L;

	@Getter @Inclui
	private final String reg = "I051";
	
	@Getter @Setter @Inclui
	private String codCcus;
	
	@Getter @Setter @Inclui
	private String codCtaRef;
	
	public RegI051(String codCcus, String codCtaRef) {
		super();
		this.codCcus = codCcus;
		this.codCtaRef = codCtaRef;
	}
	
	public RegI051() {/* */}
	
}

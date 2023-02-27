package efd.ecd.blocoI.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI015 {

	@Getter @Inclui
	private static final String reg = "I015";
	
	@Getter @Setter @Inclui
	private String codCtaRes;

	public RegI015(String codCtaRes) {
		super();
		this.codCtaRes = codCtaRes;
	}
	
	public RegI015() {/* */}
	
}

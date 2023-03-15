package efd.ecd.blocoI.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI015 implements Serializable {
	private static final long serialVersionUID = 4959981968033121377L;

	@Getter @Inclui
	private final String reg = "I015";
	
	@Getter @Setter @Inclui
	private String codCtaRes;

	public RegI015(String codCtaRes) {
		super();
		this.codCtaRes = codCtaRes;
	}
	
	public RegI015() {/* */}
	
}

package efd.ecd.blocoI.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI500 {

	@Getter @Inclui
	private static final String reg = "I500";
	
	@Getter @Setter @Inclui
	private Integer tamFonte;

	public RegI500(Integer tamFonte) {
		super();
		this.tamFonte = tamFonte;
	}
	
	public RegI500() {/* */}
	
}

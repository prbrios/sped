package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI500 implements Serializable {
	private static final long serialVersionUID = 821988277631033701L;

	@Getter @Inclui
	private final String reg = "I500";
	
	@Getter @Setter @Inclui
	private Integer tamFonte;

	public RegI500(Integer tamFonte) {
		super();
		this.tamFonte = tamFonte;
	}
	
	public RegI500() {/* */}
	
}

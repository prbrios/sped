package efd.ecd.blocoI.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI052 {

	@Getter @Inclui
	private final String reg = "I052";
	
	@Getter @Setter @Inclui
	private String codCcus;
	
	@Getter @Setter @Inclui
	private String codAgl;
	
	public RegI052(String codCcus, String codAgl) {
		super();
		this.codCcus = codCcus;
		this.codAgl = codAgl;
	}
	
	public RegI052() {/* */}
	
}

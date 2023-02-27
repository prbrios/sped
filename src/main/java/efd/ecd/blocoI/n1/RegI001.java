package efd.ecd.blocoI.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.RegI010;
import lombok.Getter;
import lombok.Setter;

public class RegI001 {

	@Getter @Inclui
	private final String reg = "I001";
	
	@Getter @Setter @Inclui
	private Integer indDad;

	@Getter @Setter @Filho
	private RegI010 regI010;
	
	public RegI001(Integer indDad) {
		super();
		this.indDad = indDad;
	}
	
	public RegI001() {/* */}
	
}

package efd.ecd.blocoC.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoC.n1.n2.RegC040;
import lombok.Getter;
import lombok.Setter;

public class RegC001 {

	@Getter @Inclui
	public final String reg = "C001";
	
	@Getter @Setter @Inclui
	private Integer indDad;
	
	@Getter @Inclui @Filho
	private RegC040 regC040;

	public RegC001(Integer indDad) {
		super();
		this.indDad = indDad;
	}
	
	public RegC001() {/* */}

}

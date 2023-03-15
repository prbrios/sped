package efd.ecd.blocoI.n1;

import java.io.Serializable;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.RegI010;
import lombok.Getter;
import lombok.Setter;

public class RegI001 implements Serializable {
	private static final long serialVersionUID = 9183954725279782397L;

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

package efd.ecd.blocoI.n1.n2.n3;

import java.time.LocalDate;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI100 {

	@Getter @Inclui
	private final String reg = "I100";
	
	@Getter @Setter @Inclui
	private LocalDate dtAlt;
	
	@Getter @Setter @Inclui
	private String codCcus;
	
	@Getter @Setter @Inclui
	private String ccus;
	
	public RegI100(LocalDate dtAlt, String codCcus, String ccus) {
		super();
		this.dtAlt = dtAlt;
		this.codCcus = codCcus;
		this.ccus = ccus;
	}
	
	public RegI100() {/* */}
	
}

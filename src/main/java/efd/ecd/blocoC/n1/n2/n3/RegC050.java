package efd.ecd.blocoC.n1.n2.n3;

import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoC.n1.n2.n3.n4.RegC051;
import lombok.Getter;
import lombok.Setter;

public class RegC050 {

	@Getter @Inclui
	private final String reg = "C050";
	
	@Getter @Setter @Inclui
	private LocalDate dtAlt;
	
	@Getter @Setter @Inclui
	private String codNat;
	
	@Getter @Setter @Inclui
	private String indCta;
	
	@Getter @Setter @Inclui
	private Integer nivel;
	
	@Getter @Setter @Inclui
	private String codCta;
	
	@Getter @Setter @Inclui
	private String codCtaSup;
	
	@Getter @Setter @Inclui
	private String cta;
	
	@Getter @Setter @Filho
	private List<RegC051> regC051;

	public RegC050(LocalDate dtAlt, String codNat, String indCta, Integer nivel, String codCta, String codCtaSup,
			String cta) {
		super();
		this.dtAlt = dtAlt;
		this.codNat = codNat;
		this.indCta = indCta;
		this.nivel = nivel;
		this.codCta = codCta;
		this.codCtaSup = codCtaSup;
		this.cta = cta;
	}
	
	public RegC050() {/* */}
	
}

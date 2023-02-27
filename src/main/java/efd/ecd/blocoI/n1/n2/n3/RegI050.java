package efd.ecd.blocoI.n1.n2.n3;

import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI051;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI052;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI053;
import lombok.Getter;
import lombok.Setter;

public class RegI050 {

	@Getter @Inclui
	private static final String reg = "I050";
	
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
	private List<RegI051> regI051;
	
	@Getter @Setter @Filho
	private List<RegI052> regI052;
	
	@Getter @Setter @Filho
	private List<RegI053> regI053;
	
	public RegI050(LocalDate dtAlt, String codNat, String indCta, Integer nivel, String codCta, String codCtaSup,
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
	
	public RegI050() {/* */}
	
}

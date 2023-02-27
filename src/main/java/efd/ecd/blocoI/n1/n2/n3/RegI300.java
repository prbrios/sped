package efd.ecd.blocoI.n1.n2.n3;

import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI310;
import lombok.Getter;
import lombok.Setter;

public class RegI300 {

	@Getter @Inclui
	private static final String reg = "I300";
	
	@Getter @Setter @Inclui
	private LocalDate dtBcte;

	@Getter @Setter @Filho
	private List<RegI310> regI310;
	
	public RegI300(LocalDate dtBcte) {
		super();
		this.dtBcte = dtBcte;
	}
	
	public RegI300() {/* */}
	
}

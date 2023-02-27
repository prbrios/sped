package efd.ecd.blocoI.n1.n2.n3;

import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI155;
import lombok.Getter;
import lombok.Setter;

public class RegI150 {

	@Getter @Inclui
	private static final String reg = "I150";
	
	@Getter @Setter @Inclui
	private LocalDate dtIni;
	
	@Getter @Setter @Inclui
	private LocalDate dtFin;
	
	@Getter @Setter @Filho
	private List<RegI155> regI155;
	
	public RegI150(LocalDate dtIni, LocalDate dtFin) {
		super();
		this.dtIni = dtIni;
		this.dtFin = dtFin;
	}
	
	public RegI150() {/* */}
	
}

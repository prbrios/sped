package efd.ecd.blocoC.n1.n2.n3;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoC.n1.n2.n3.n4.RegC155;
import lombok.Getter;
import lombok.Setter;

public class RegC150 implements Serializable {
	private static final long serialVersionUID = 1462202575822414263L;

	@Getter @Inclui
	private final String reg = "C150";
	
	@Getter @Setter @Inclui
	private LocalDate dtIni;
	
	@Getter @Setter @Inclui
	private LocalDate dtFin;
	
	@Getter @Setter @Filho
	private List<RegC155> regC155;

	public RegC150(LocalDate dtIni, LocalDate dtFin) {
		super();
		this.dtIni = dtIni;
		this.dtFin = dtFin;
	}
	
	public RegC150() {/* */}
	
}

package efd.ecd.blocoC.n1.n2.n3;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoC.n1.n2.n3.n4.RegC650;
import lombok.Getter;
import lombok.Setter;

public class RegC600 implements Serializable {
	private static final long serialVersionUID = -6742340482195872555L;

	@Getter @Inclui
	private final String reg = "C600";
	
	@Getter @Setter @Inclui
	private LocalDate dtIni;
	
	@Getter @Setter @Inclui
	private LocalDate dtFin;
	
	@Getter @Setter @Inclui
	private Integer idDem;
	
	@Getter @Setter @Inclui
	private String cabDem;
	
	@Getter @Setter @Filho
	private List<RegC650> regC650;

	public RegC600(LocalDate dtIni, LocalDate dtFin, Integer idDem, String cabDem) {
		super();
		this.dtIni = dtIni;
		this.dtFin = dtFin;
		this.idDem = idDem;
		this.cabDem = cabDem;
	}
	
	public RegC600() {/* */}

}

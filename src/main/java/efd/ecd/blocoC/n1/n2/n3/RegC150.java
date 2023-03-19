package efd.ecd.blocoC.n1.n2.n3;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoC.n1.n2.n3.n4.RegC155;

public class RegC150 implements Serializable {
	private static final long serialVersionUID = 1462202575822414263L;

	@Inclui
	private final String reg = "C150";
	
	@Inclui
	private LocalDate dtIni;
	
	@Inclui
	private LocalDate dtFin;
	
	@Filho
	private List<RegC155> regC155;

	public RegC150(LocalDate dtIni, LocalDate dtFin) {
		super();
		this.dtIni = dtIni;
		this.dtFin = dtFin;
	}
	
	public RegC150() {/* */}

	public String getReg() {
		return reg;
	}

	public LocalDate getDtIni() {
		return dtIni;
	}

	public void setDtIni(LocalDate dtIni) {
		this.dtIni = dtIni;
	}

	public LocalDate getDtFin() {
		return dtFin;
	}

	public void setDtFin(LocalDate dtFin) {
		this.dtFin = dtFin;
	}

	public List<RegC155> getRegC155() {
		return regC155;
	}

	public void setRegC155(List<RegC155> regC155) {
		this.regC155 = regC155;
	}
	
	
}

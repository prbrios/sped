package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI155;

public class RegI150 implements Serializable {
	private static final long serialVersionUID = 5491709407948730135L;

	@Inclui
	private final String reg = "I150";
	
	@Inclui
	private LocalDate dtIni;
	
	@Inclui
	private LocalDate dtFin;
	
	@Filho
	private List<RegI155> regI155;
	
	public RegI150(LocalDate dtIni, LocalDate dtFin) {
		super();
		this.dtIni = dtIni;
		this.dtFin = dtFin;
	}
	
	public RegI150() {/* */}

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

	public List<RegI155> getRegI155() {
		return regI155;
	}

	public void setRegI155(List<RegI155> regI155) {
		this.regI155 = regI155;
	}
	
	
}

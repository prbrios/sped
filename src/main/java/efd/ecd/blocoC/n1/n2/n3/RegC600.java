package efd.ecd.blocoC.n1.n2.n3;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoC.n1.n2.n3.n4.RegC650;

public class RegC600 implements Serializable {
	private static final long serialVersionUID = -6742340482195872555L;

	@Inclui
	private final String reg = "C600";
	
	@Inclui
	private LocalDate dtIni;
	
	@Inclui
	private LocalDate dtFin;
	
	@Inclui
	private Integer idDem;
	
	@Inclui
	private String cabDem;
	
	@Filho
	private List<RegC650> regC650;

	public RegC600(LocalDate dtIni, LocalDate dtFin, Integer idDem, String cabDem) {
		super();
		this.dtIni = dtIni;
		this.dtFin = dtFin;
		this.idDem = idDem;
		this.cabDem = cabDem;
	}
	
	public RegC600() {/* */}

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

	public Integer getIdDem() {
		return idDem;
	}

	public void setIdDem(Integer idDem) {
		this.idDem = idDem;
	}

	public String getCabDem() {
		return cabDem;
	}

	public void setCabDem(String cabDem) {
		this.cabDem = cabDem;
	}

	public List<RegC650> getRegC650() {
		return regC650;
	}

	public void setRegC650(List<RegC650> regC650) {
		this.regC650 = regC650;
	}
	

}

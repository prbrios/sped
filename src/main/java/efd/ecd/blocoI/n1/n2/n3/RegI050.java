package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI051;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI052;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI053;

public class RegI050 implements Serializable {
	private static final long serialVersionUID = 3651787729574069269L;

	@Inclui
	private final String reg = "I050";
	
	@Inclui
	private LocalDate dtAlt;
	
	@Inclui
	private String codNat;
	
	@Inclui
	private String indCta;
	
	@Inclui
	private Integer nivel;
	
	@Inclui
	private String codCta;
	
	@Inclui
	private String codCtaSup;
	
	@Inclui
	private String cta;
	
	@Filho
	private List<RegI051> regI051;
	
	@Filho
	private List<RegI052> regI052;
	
	@Filho
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

	public String getReg() {
		return reg;
	}

	public LocalDate getDtAlt() {
		return dtAlt;
	}

	public void setDtAlt(LocalDate dtAlt) {
		this.dtAlt = dtAlt;
	}

	public String getCodNat() {
		return codNat;
	}

	public void setCodNat(String codNat) {
		this.codNat = codNat;
	}

	public String getIndCta() {
		return indCta;
	}

	public void setIndCta(String indCta) {
		this.indCta = indCta;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public String getCodCta() {
		return codCta;
	}

	public void setCodCta(String codCta) {
		this.codCta = codCta;
	}

	public String getCodCtaSup() {
		return codCtaSup;
	}

	public void setCodCtaSup(String codCtaSup) {
		this.codCtaSup = codCtaSup;
	}

	public String getCta() {
		return cta;
	}

	public void setCta(String cta) {
		this.cta = cta;
	}

	public List<RegI051> getRegI051() {
		return regI051;
	}

	public void setRegI051(List<RegI051> regI051) {
		this.regI051 = regI051;
	}

	public List<RegI052> getRegI052() {
		return regI052;
	}

	public void setRegI052(List<RegI052> regI052) {
		this.regI052 = regI052;
	}

	public List<RegI053> getRegI053() {
		return regI053;
	}

	public void setRegI053(List<RegI053> regI053) {
		this.regI053 = regI053;
	}
	
	
}

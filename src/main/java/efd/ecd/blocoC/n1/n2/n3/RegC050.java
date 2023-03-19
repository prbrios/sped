package efd.ecd.blocoC.n1.n2.n3;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoC.n1.n2.n3.n4.RegC051;

public class RegC050 implements Serializable {
	private static final long serialVersionUID = -3349345202397418875L;

	@Inclui
	private final String reg = "C050";
	
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

	public List<RegC051> getRegC051() {
		return regC051;
	}

	public void setRegC051(List<RegC051> regC051) {
		this.regC051 = regC051;
	}
	
	
}

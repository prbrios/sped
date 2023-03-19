package efd.ecd.bloco0.n1.n2.n3;

import java.io.Serializable;
import java.time.LocalDate;

import efd.anotacoes.Inclui;

public class Reg0180 implements Serializable {
	private static final long serialVersionUID = -3739773162530128583L;

	@Inclui
    private final String reg = "0180";
	
	@Inclui
	private Integer codRel;
	
	@Inclui
	private LocalDate dtIniRel;
	
	@Inclui
	private LocalDate dtFinRel;

	public Reg0180(Integer codRel, LocalDate dtIniRel, LocalDate dtFinRel) {
		super();
		this.codRel = codRel;
		this.dtIniRel = dtIniRel;
		this.dtFinRel = dtFinRel;
	}
	
	public Reg0180() {/* */}

	public String getReg() {
		return reg;
	}

	public Integer getCodRel() {
		return codRel;
	}

	public void setCodRel(Integer codRel) {
		this.codRel = codRel;
	}

	public LocalDate getDtIniRel() {
		return dtIniRel;
	}

	public void setDtIniRel(LocalDate dtIniRel) {
		this.dtIniRel = dtIniRel;
	}

	public LocalDate getDtFinRel() {
		return dtFinRel;
	}

	public void setDtFinRel(LocalDate dtFinRel) {
		this.dtFinRel = dtFinRel;
	}
	
}

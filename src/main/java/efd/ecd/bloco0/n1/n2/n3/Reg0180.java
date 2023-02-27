package efd.ecd.bloco0.n1.n2.n3;

import java.time.LocalDate;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0180 {
    
	@Getter @Inclui
    private final String reg = "0180";
	
	@Getter @Setter @Inclui
	private Integer codRel;
	
	@Getter @Setter @Inclui
	private LocalDate dtIniRel;
	
	@Getter @Setter @Inclui
	private LocalDate dtFinRel;

	public Reg0180(Integer codRel, LocalDate dtIniRel, LocalDate dtFinRel) {
		super();
		this.codRel = codRel;
		this.dtIniRel = dtIniRel;
		this.dtFinRel = dtFinRel;
	}
	
	public Reg0180() {/* */}
}

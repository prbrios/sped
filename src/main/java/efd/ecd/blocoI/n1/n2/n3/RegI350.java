package efd.ecd.blocoI.n1.n2.n3;

import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI355;
import lombok.Getter;
import lombok.Setter;

public class RegI350 {

	@Getter @Inclui
	private final String reg = "I350";
	
	@Getter @Setter @Inclui
	private LocalDate dtRes;

	@Getter @Setter @Filho
	private List<RegI355> regI355;
	
	public RegI350(LocalDate dtRes) {
		super();
		this.dtRes = dtRes;
	}
	
	public RegI350() {/* */}
	
}

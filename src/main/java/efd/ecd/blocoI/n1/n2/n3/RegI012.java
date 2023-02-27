package efd.ecd.blocoI.n1.n2.n3;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI015;
import lombok.Getter;
import lombok.Setter;

public class RegI012 {

	@Getter @Inclui
	private final String reg = "I012";
	
	@Getter @Setter @Inclui
	private Integer numOrd;
	
	@Getter @Setter @Inclui
	private String natLivr;
	
	@Getter @Setter @Inclui
	private Integer tipo;
	
	@Getter @Setter @Inclui
	private String codHashAux;
	
	@Getter @Setter @Filho
	private List<RegI015> regI015;
	
	public RegI012(Integer numOrd, String natLivr, Integer tipo, String codHashAux) {
		super();
		this.numOrd = numOrd;
		this.natLivr = natLivr;
		this.tipo = tipo;
		this.codHashAux = codHashAux;
	}
	
	public RegI012() {/* */}
	
}

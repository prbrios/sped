package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI555;
import lombok.Getter;
import lombok.Setter;

public class RegI550 implements Serializable {
	private static final long serialVersionUID = -8211989967080704594L;

	@Getter @Inclui
	private final String reg = "I550";
	
	@Getter @Setter @Inclui
	private String rzCont;

	@Getter @Setter @Filho
	private List<RegI555> regI555;
	
	public RegI550(String rzCont) {
		super();
		this.rzCont = rzCont;
	}
	
	public RegI550() {/* */}
	
}

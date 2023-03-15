package efd.ecd.blocoI.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI555 implements Serializable {
	private static final long serialVersionUID = -4761243437714561515L;

	@Getter @Inclui
	private final String reg = "I555";
	
	@Getter @Setter @Inclui
	private String rzContTot;

	public RegI555(String rzContTot) {
		super();
		this.rzContTot = rzContTot;
	}
	
	public RegI555() {/* */}
	
}

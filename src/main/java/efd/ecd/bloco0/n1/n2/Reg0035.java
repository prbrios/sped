package efd.ecd.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0035 {
    
	@Getter @Inclui
	private final String reg = "0035";
	
	@Getter @Setter @Inclui
	private String codScp;
	
	@Getter @Setter @Inclui
	private String nomeScp;

	public Reg0035(String codScp, String nomeScp) {
		super();
		this.codScp = codScp;
		this.nomeScp = nomeScp;
	}
	
	public Reg0035() {/* */}
	
}

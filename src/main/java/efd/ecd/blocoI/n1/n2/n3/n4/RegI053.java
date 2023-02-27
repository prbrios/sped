package efd.ecd.blocoI.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI053 {

	@Getter @Inclui
	private final String reg = "I053";
	
	@Getter @Setter @Inclui
	private String codIdt;
	
	@Getter @Setter @Inclui
	private String codCntCorr;
	
	@Getter @Setter @Inclui
	private String natSubCnt;
	
	public RegI053(String codIdt, String codCntCorr, String natSubCnt) {
		super();
		this.codIdt = codIdt;
		this.codCntCorr = codCntCorr;
		this.natSubCnt = natSubCnt;
	}
	
	public RegI053() {/* */}
	
}

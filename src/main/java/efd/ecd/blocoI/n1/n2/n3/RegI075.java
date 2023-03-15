package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI075 implements Serializable {
	private static final long serialVersionUID = -4014361912805718556L;

	@Getter @Inclui
	private final String reg = "I075";
	
	@Getter @Setter @Inclui
	private String codHist;
	
	@Getter @Setter @Inclui
	private String descrHist;
	
	public RegI075(String codHist, String descrHist) {
		super();
		this.codHist = codHist;
		this.descrHist = descrHist;
	}
	
	public RegI075() {/* */}
	
}

package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI510 implements Serializable {
	private static final long serialVersionUID = -5568442348739517163L;

	@Getter @Inclui
	private final String reg = "I510";
	
	@Getter @Setter @Inclui
	private String nmCampo;
	
	@Getter @Setter @Inclui
	private String descCampo;
	
	@Getter @Setter @Inclui
	private String tipoCampo;
	
	@Getter @Setter @Inclui
	private Integer tamCampo;
	
	@Getter @Setter @Inclui
	private String decCampo;
	
	@Getter @Setter @Inclui
	private String colCampo;
	
	public RegI510(String nmCampo, String descCampo, String tipoCampo, Integer tamCampo, String decCampo,
			String colCampo) {
		super();
		this.nmCampo = nmCampo;
		this.descCampo = descCampo;
		this.tipoCampo = tipoCampo;
		this.tamCampo = tamCampo;
		this.decCampo = decCampo;
		this.colCampo = colCampo;
	}
	
	public RegI510() {/* */}
	
}

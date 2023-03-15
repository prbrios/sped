package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI020 implements Serializable {
	private static final long serialVersionUID = 161050044760143814L;

	@Getter @Inclui
	private final String reg = "I020";
	
	@Getter @Setter @Inclui
	private String regCod;
	
	@Getter @Setter @Inclui
	private Integer numAd;
	
	@Getter @Setter @Inclui
	private String campo;
	
	@Getter @Setter @Inclui
	private String descricao;
	
	@Getter @Setter @Inclui
	private String tipo;
	
	public RegI020(String regCod, Integer numAd, String campo, String descricao, String tipo) {
		super();
		this.regCod = regCod;
		this.numAd = numAd;
		this.campo = campo;
		this.descricao = descricao;
		this.tipo = tipo;
	}
	
	public RegI020() {/* */}
	
}

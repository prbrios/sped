package efd.ecd.blocoI.n1.n2.n3;

import java.time.LocalDate;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI030 {

	@Getter @Inclui
	private final String reg = "I030";
	
	@Getter @Setter @Inclui
	private String dnrcAbert;
	
	@Getter @Setter @Inclui
	private Integer numOrd;
	
	@Getter @Setter @Inclui
	private String natLivr;
	
	@Getter @Setter @Inclui
	private Integer qtdLin;
	
	@Getter @Setter @Inclui
	private String nome;
	
	@Getter @Setter @Inclui
	private Long nire;
	
	@Getter @Setter @Inclui
	private Long cnpj;
	
	@Getter @Setter @Inclui
	private LocalDate dtArq;
	
	@Getter @Setter @Inclui
	private LocalDate dtArqConv;
	
	@Getter @Setter @Inclui
	private String descMun;
	
	@Getter @Setter @Inclui
	private LocalDate dtExSocial;
	
	public RegI030(String dnrcAbert, Integer numOrd, String natLivr, Integer qtdLin, String nome, Long nire, Long cnpj,
			LocalDate dtArq, LocalDate dtArqConv, String descMun, LocalDate dtExSocial) {
		super();
		this.dnrcAbert = dnrcAbert;
		this.numOrd = numOrd;
		this.natLivr = natLivr;
		this.qtdLin = qtdLin;
		this.nome = nome;
		this.nire = nire;
		this.cnpj = cnpj;
		this.dtArq = dtArq;
		this.dtArqConv = dtArqConv;
		this.descMun = descMun;
		this.dtExSocial = dtExSocial;
	}
	
	public RegI030() {/* */}
	
}

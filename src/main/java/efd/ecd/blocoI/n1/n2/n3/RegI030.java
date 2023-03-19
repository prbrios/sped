package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;
import java.time.LocalDate;

import efd.anotacoes.Inclui;

public class RegI030 implements Serializable {
	private static final long serialVersionUID = -5408403529501668244L;

	@Inclui
	private final String reg = "I030";
	
	@Inclui
	private String dnrcAbert;
	
	@Inclui
	private Integer numOrd;
	
	@Inclui
	private String natLivr;
	
	@Inclui
	private Integer qtdLin;
	
	@Inclui
	private String nome;
	
	@Inclui
	private Long nire;
	
	@Inclui
	private Long cnpj;
	
	@Inclui
	private LocalDate dtArq;
	
	@Inclui
	private LocalDate dtArqConv;
	
	@Inclui
	private String descMun;
	
	@Inclui
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

	public String getReg() {
		return reg;
	}

	public String getDnrcAbert() {
		return dnrcAbert;
	}

	public void setDnrcAbert(String dnrcAbert) {
		this.dnrcAbert = dnrcAbert;
	}

	public Integer getNumOrd() {
		return numOrd;
	}

	public void setNumOrd(Integer numOrd) {
		this.numOrd = numOrd;
	}

	public String getNatLivr() {
		return natLivr;
	}

	public void setNatLivr(String natLivr) {
		this.natLivr = natLivr;
	}

	public Integer getQtdLin() {
		return qtdLin;
	}

	public void setQtdLin(Integer qtdLin) {
		this.qtdLin = qtdLin;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getNire() {
		return nire;
	}

	public void setNire(Long nire) {
		this.nire = nire;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public LocalDate getDtArq() {
		return dtArq;
	}

	public void setDtArq(LocalDate dtArq) {
		this.dtArq = dtArq;
	}

	public LocalDate getDtArqConv() {
		return dtArqConv;
	}

	public void setDtArqConv(LocalDate dtArqConv) {
		this.dtArqConv = dtArqConv;
	}

	public String getDescMun() {
		return descMun;
	}

	public void setDescMun(String descMun) {
		this.descMun = descMun;
	}

	public LocalDate getDtExSocial() {
		return dtExSocial;
	}

	public void setDtExSocial(LocalDate dtExSocial) {
		this.dtExSocial = dtExSocial;
	}
	
	
}

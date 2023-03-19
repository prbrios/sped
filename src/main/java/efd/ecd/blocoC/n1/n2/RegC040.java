package efd.ecd.blocoC.n1.n2;

import java.io.Serializable;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoC.n1.n2.n3.RegC050;
import efd.ecd.blocoC.n1.n2.n3.RegC150;
import efd.ecd.blocoC.n1.n2.n3.RegC600;

public class RegC040 implements Serializable {
	private static final long serialVersionUID = 3861368528060633211L;

	@Inclui
	private final String reg = "C040";
	
	@Inclui
	private String hashEcdRec;
	
	@Inclui
	private Integer dtIniEcdRec;
	
	@Inclui
	private Integer dtFinEcdRec;
	
	@Inclui
	private Integer cnpjEcdRec;
	
	@Inclui
	private String indEsc;
	
	@Inclui
	private String codVerLc;
	
	@Inclui
	private Integer numOrd;
	
	@Inclui
	private String natLivr;
	
	@Inclui
	private Integer indSitEspEcdRec;
	
	@Inclui
	private Integer indNireEcdRec;
	
	@Inclui
	private Integer indFinEscEcdRec;
	
	@Inclui
	private Integer tipEcdRec;
	
	@Inclui
	private Integer codScpEcdRec;
	
	@Inclui
	private String identMfEcdRec;
	
	@Inclui
	private String indEscConsEcdRec;
	
	@Inclui
	private Integer indCentralizadaEcdRec;
	
	@Inclui
	private Integer indMudancaPcEcdRec;
	
	@Inclui
	private Integer indPlanoRefEcdRec;
	
	@Filho
	private List<RegC050> regC050;
	
	@Filho
	private RegC150 regC150;
	
	@Filho
	private List<RegC600> regC600;

	public RegC040(String hashEcdRec, Integer dtIniEcdRec, Integer dtFinEcdRec, Integer cnpjEcdRec, String indEsc,
			String codVerLc, Integer numOrd, String natLivr, Integer indSitEspEcdRec, Integer indNireEcdRec,
			Integer indFinEscEcdRec, Integer tipEcdRec, Integer codScpEcdRec, String identMfEcdRec,
			String indEscConsEcdRec, Integer indCentralizadaEcdRec, Integer indMudancaPcEcdRec,
			Integer indPlanoRefEcdRec) {
		super();
		this.hashEcdRec = hashEcdRec;
		this.dtIniEcdRec = dtIniEcdRec;
		this.dtFinEcdRec = dtFinEcdRec;
		this.cnpjEcdRec = cnpjEcdRec;
		this.indEsc = indEsc;
		this.codVerLc = codVerLc;
		this.numOrd = numOrd;
		this.natLivr = natLivr;
		this.indSitEspEcdRec = indSitEspEcdRec;
		this.indNireEcdRec = indNireEcdRec;
		this.indFinEscEcdRec = indFinEscEcdRec;
		this.tipEcdRec = tipEcdRec;
		this.codScpEcdRec = codScpEcdRec;
		this.identMfEcdRec = identMfEcdRec;
		this.indEscConsEcdRec = indEscConsEcdRec;
		this.indCentralizadaEcdRec = indCentralizadaEcdRec;
		this.indMudancaPcEcdRec = indMudancaPcEcdRec;
		this.indPlanoRefEcdRec = indPlanoRefEcdRec;
	}
	
	public RegC040() {/* */}

	public String getReg() {
		return reg;
	}

	public String getHashEcdRec() {
		return hashEcdRec;
	}

	public void setHashEcdRec(String hashEcdRec) {
		this.hashEcdRec = hashEcdRec;
	}

	public Integer getDtIniEcdRec() {
		return dtIniEcdRec;
	}

	public void setDtIniEcdRec(Integer dtIniEcdRec) {
		this.dtIniEcdRec = dtIniEcdRec;
	}

	public Integer getDtFinEcdRec() {
		return dtFinEcdRec;
	}

	public void setDtFinEcdRec(Integer dtFinEcdRec) {
		this.dtFinEcdRec = dtFinEcdRec;
	}

	public Integer getCnpjEcdRec() {
		return cnpjEcdRec;
	}

	public void setCnpjEcdRec(Integer cnpjEcdRec) {
		this.cnpjEcdRec = cnpjEcdRec;
	}

	public String getIndEsc() {
		return indEsc;
	}

	public void setIndEsc(String indEsc) {
		this.indEsc = indEsc;
	}

	public String getCodVerLc() {
		return codVerLc;
	}

	public void setCodVerLc(String codVerLc) {
		this.codVerLc = codVerLc;
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

	public Integer getIndSitEspEcdRec() {
		return indSitEspEcdRec;
	}

	public void setIndSitEspEcdRec(Integer indSitEspEcdRec) {
		this.indSitEspEcdRec = indSitEspEcdRec;
	}

	public Integer getIndNireEcdRec() {
		return indNireEcdRec;
	}

	public void setIndNireEcdRec(Integer indNireEcdRec) {
		this.indNireEcdRec = indNireEcdRec;
	}

	public Integer getIndFinEscEcdRec() {
		return indFinEscEcdRec;
	}

	public void setIndFinEscEcdRec(Integer indFinEscEcdRec) {
		this.indFinEscEcdRec = indFinEscEcdRec;
	}

	public Integer getTipEcdRec() {
		return tipEcdRec;
	}

	public void setTipEcdRec(Integer tipEcdRec) {
		this.tipEcdRec = tipEcdRec;
	}

	public Integer getCodScpEcdRec() {
		return codScpEcdRec;
	}

	public void setCodScpEcdRec(Integer codScpEcdRec) {
		this.codScpEcdRec = codScpEcdRec;
	}

	public String getIdentMfEcdRec() {
		return identMfEcdRec;
	}

	public void setIdentMfEcdRec(String identMfEcdRec) {
		this.identMfEcdRec = identMfEcdRec;
	}

	public String getIndEscConsEcdRec() {
		return indEscConsEcdRec;
	}

	public void setIndEscConsEcdRec(String indEscConsEcdRec) {
		this.indEscConsEcdRec = indEscConsEcdRec;
	}

	public Integer getIndCentralizadaEcdRec() {
		return indCentralizadaEcdRec;
	}

	public void setIndCentralizadaEcdRec(Integer indCentralizadaEcdRec) {
		this.indCentralizadaEcdRec = indCentralizadaEcdRec;
	}

	public Integer getIndMudancaPcEcdRec() {
		return indMudancaPcEcdRec;
	}

	public void setIndMudancaPcEcdRec(Integer indMudancaPcEcdRec) {
		this.indMudancaPcEcdRec = indMudancaPcEcdRec;
	}

	public Integer getIndPlanoRefEcdRec() {
		return indPlanoRefEcdRec;
	}

	public void setIndPlanoRefEcdRec(Integer indPlanoRefEcdRec) {
		this.indPlanoRefEcdRec = indPlanoRefEcdRec;
	}

	public List<RegC050> getRegC050() {
		return regC050;
	}

	public void setRegC050(List<RegC050> regC050) {
		this.regC050 = regC050;
	}

	public RegC150 getRegC150() {
		return regC150;
	}

	public void setRegC150(RegC150 regC150) {
		this.regC150 = regC150;
	}

	public List<RegC600> getRegC600() {
		return regC600;
	}

	public void setRegC600(List<RegC600> regC600) {
		this.regC600 = regC600;
	}
	
}

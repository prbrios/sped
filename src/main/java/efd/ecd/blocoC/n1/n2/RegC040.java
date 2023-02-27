package efd.ecd.blocoC.n1.n2;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoC.n1.n2.n3.RegC050;
import efd.ecd.blocoC.n1.n2.n3.RegC150;
import efd.ecd.blocoC.n1.n2.n3.RegC600;
import lombok.Getter;
import lombok.Setter;

public class RegC040 {

	@Getter @Inclui
	private final String reg = "C040";
	
	@Getter @Setter @Inclui
	private String hashEcdRec;
	
	@Getter @Setter @Inclui
	private Integer dtIniEcdRec;
	
	@Getter @Setter @Inclui
	private Integer dtFinEcdRec;
	
	@Getter @Setter @Inclui
	private Integer cnpjEcdRec;
	
	@Getter @Setter @Inclui
	private String indEsc;
	
	@Getter @Setter @Inclui
	private String codVerLc;
	
	@Getter @Setter @Inclui
	private Integer numOrd;
	
	@Getter @Setter @Inclui
	private String natLivr;
	
	@Getter @Setter @Inclui
	private Integer indSitEspEcdRec;
	
	@Getter @Setter @Inclui
	private Integer indNireEcdRec;
	
	@Getter @Setter @Inclui
	private Integer indFinEscEcdRec;
	
	@Getter @Setter @Inclui
	private Integer tipEcdRec;
	
	@Getter @Setter @Inclui
	private Integer codScpEcdRec;
	
	@Getter @Setter @Inclui
	private String identMfEcdRec;
	
	@Getter @Setter @Inclui
	private String indEscConsEcdRec;
	
	@Getter @Setter @Inclui
	private Integer indCentralizadaEcdRec;
	
	@Getter @Setter @Inclui
	private Integer indMudancaPcEcdRec;
	
	@Getter @Setter @Inclui
	private Integer indPlanoRefEcdRec;
	
	@Getter @Setter @Filho
	private List<RegC050> regC050;
	
	@Getter @Setter @Filho
	private RegC150 regC150;
	
	@Getter @Setter @Filho
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
}

package efd.ecd.blocoI.n1.n2.n3.n4;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.n3.n4.n5.RegI157;
import lombok.Getter;
import lombok.Setter;

public class RegI155 implements Serializable {
	private static final long serialVersionUID = -2858481449217280533L;

	@Getter @Inclui
	private final String reg = "I155";
	
	@Getter @Setter @Inclui
	private String codCta;
	
	@Getter @Setter @Inclui
	private String codCcus;
	
	@Getter @Setter @Inclui
	private BigDecimal vlSldIni;
	
	@Getter @Setter @Inclui
	private String indDcIni;
	
	@Getter @Setter @Inclui
	private BigDecimal vlDeb;
	
	@Getter @Setter @Inclui
	private BigDecimal vlCred;
	
	@Getter @Setter @Inclui
	private BigDecimal vlSldFin;
	
	@Getter @Setter @Inclui
	private String indDcFin;
	
	@Getter @Setter @Inclui
	private BigDecimal vlSldIniMf;
	
	@Getter @Setter @Inclui
	private String indDcIniMf;
	
	@Getter @Setter @Inclui
	private BigDecimal vlDebMf;
	
	@Getter @Setter @Inclui
	private BigDecimal vlCredMf;
	
	@Getter @Setter @Inclui
	private BigDecimal vlSldFinMf;
	
	@Getter @Setter @Inclui
	private String indDcFinMf;
	
	@Getter @Setter @Filho
	private List<RegI157> regI157;
	
	public RegI155(String codCta, String codCcus, BigDecimal vlSldIni, String indDcIni, BigDecimal vlDeb,
			BigDecimal vlCred, BigDecimal vlSldFin, String indDcFin, BigDecimal vlSldIniMf, String indDcIniMf,
			BigDecimal vlDebMf, BigDecimal vlCredMf, BigDecimal vlSldFinMf, String indDcFinMf) {
		super();
		this.codCta = codCta;
		this.codCcus = codCcus;
		this.vlSldIni = vlSldIni;
		this.indDcIni = indDcIni;
		this.vlDeb = vlDeb;
		this.vlCred = vlCred;
		this.vlSldFin = vlSldFin;
		this.indDcFin = indDcFin;
		this.vlSldIniMf = vlSldIniMf;
		this.indDcIniMf = indDcIniMf;
		this.vlDebMf = vlDebMf;
		this.vlCredMf = vlCredMf;
		this.vlSldFinMf = vlSldFinMf;
		this.indDcFinMf = indDcFinMf;
	}
	
	public RegI155() {/* */}
	
}

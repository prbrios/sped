package efd.ecd.blocoI.n1.n2.n3.n4.n5;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI157 {

	@Getter @Inclui
	private static final String reg = "I157";
	
	@Getter @Setter @Inclui
	private String codCta;
	
	@Getter @Setter @Inclui
	private String codCcus;
	
	@Getter @Setter @Inclui
	private BigDecimal vlSldIni;
	
	@Getter @Setter @Inclui
	private String indDcIni;
	
	@Getter @Setter @Inclui
	private BigDecimal vlSldIniMf;
	
	@Getter @Setter @Inclui
	private String indDcIniMf;

	public RegI157(String codCta, String codCcus, BigDecimal vlSldIni, String indDcIni, BigDecimal vlSldIniMf,
			String indDcIniMf) {
		super();
		this.codCta = codCta;
		this.codCcus = codCcus;
		this.vlSldIni = vlSldIni;
		this.indDcIni = indDcIni;
		this.vlSldIniMf = vlSldIniMf;
		this.indDcIniMf = indDcIniMf;
	}
	
	public RegI157() {/**/}
	
}

package efd.icmsipi.blocoC.n1.n2.n3.n4;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegC597 {

	@Getter @Inclui
	private final String reg = "C597";

	@Getter @Setter @Inclui
	private String codAj;

	@Getter @Setter @Inclui
	private String descrComplaj;

	@Getter @Setter @Inclui
	private String codItem;

	@Getter @Setter @Inclui(casasDecimais = 2)
	private BigDecimal vlBcIcms;

	@Getter @Setter @Inclui(casasDecimais = 2)
	private BigDecimal aliqIcms;

	@Getter @Setter @Inclui(casasDecimais = 2)
	private BigDecimal vlIcms;

	@Getter @Setter @Inclui(casasDecimais = 2)
	private BigDecimal vlOutros;

	public RegC597(String codAj, String descrComplaj, String codItem, BigDecimal vlBcIcms, BigDecimal aliqIcms, BigDecimal vlIcms, BigDecimal vlOutros) {
		this.codAj = codAj;
		this.descrComplaj = descrComplaj;
		this.codItem = codItem;
		this.vlBcIcms = vlBcIcms;
		this.aliqIcms = aliqIcms;
		this.vlIcms = vlIcms;
		this.vlOutros = vlOutros;
	}

	public RegC597(){}
}

package efd.icmsipi.blocoH.n1.n2.n3.n4;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegH030 {

	@Getter @Inclui
	private final String reg = "H030";

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlIcmsOp;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlBcIcmsSt;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlIcmsSt;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlFcp;

	public RegH030(BigDecimal vlIcmsOp, BigDecimal vlBcIcmsSt, BigDecimal vlIcmsSt, BigDecimal vlFcp) {
		this.vlIcmsOp = vlIcmsOp;
		this.vlBcIcmsSt = vlBcIcmsSt;
		this.vlIcmsSt = vlIcmsSt;
		this.vlFcp = vlFcp;
	}

	public RegH030(){}

}

package efd.icmsipi.bloco1.n1.n2;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg1601 {

	@Getter @Inclui
    private final String reg = "1601";

	@Getter @Setter @Inclui
	private String codPartIp;

	@Getter @Setter @Inclui
	private String codPartIt;

	@Getter @Setter @Inclui(casasDecimais = 2)
	private BigDecimal totVs;

	@Getter @Setter @Inclui(casasDecimais = 2)
	private BigDecimal totIss;

	@Getter @Setter @Inclui(casasDecimais = 2)
	private BigDecimal totOutros;

	public Reg1601(String codPartIp, String codPartIt, BigDecimal totVs, BigDecimal totIss, BigDecimal totOutros) {
		this.codPartIp = codPartIp;
		this.codPartIt = codPartIt;
		this.totVs = totVs;
		this.totIss = totIss;
		this.totOutros = totOutros;
	}

	public Reg1601() {}
	
}

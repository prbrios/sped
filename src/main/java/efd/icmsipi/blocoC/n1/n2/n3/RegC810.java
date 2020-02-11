package efd.icmsipi.blocoC.n1.n2.n3;

import java.math.BigDecimal;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC815;
import lombok.Getter;
import lombok.Setter;

public class RegC810 {

	@Getter @Inclui
	private final String reg = "C810";

	@Getter @Setter @Inclui
	private Integer numItem;

	@Getter @Setter @Inclui
	private String codItem;

	@Getter @Setter @Inclui(casasDecimais = 5)
	private BigDecimal qtd;

	@Getter @Setter @Inclui
	private String unid;

	@Getter @Setter @Inclui
	private BigDecimal vlItem;

	@Getter @Setter @Inclui(zerosEsquerda = 3)
	private Integer cstIcms;

	@Getter @Setter @Inclui(zerosEsquerda = 4)
	private Integer cfop;

	@Getter @Setter @Filho
	private RegC815 regC815;

	public RegC810(Integer numItem, String codItem, BigDecimal qtd, String unid, BigDecimal vlItem, Integer cstIcms, Integer cfop) {
		this.numItem = numItem;
		this.codItem = codItem;
		this.qtd = qtd;
		this.unid = unid;
		this.vlItem = vlItem;
		this.cstIcms = cstIcms;
		this.cfop = cfop;
	}

	public RegC810(){}

}

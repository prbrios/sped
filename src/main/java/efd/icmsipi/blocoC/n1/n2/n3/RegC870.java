package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC880;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC870 implements Serializable {
	private static final long serialVersionUID = 7972959099278252893L;

	@Getter @Inclui
	private final String reg = "C870";

	@Getter @Setter @Inclui
	private String codItem;

	@Getter @Setter @Inclui(casasDecimais = 5)
	private BigDecimal qtd;

	@Getter @Setter @Inclui
	private String unid;

	@Getter @Setter @Inclui(zerosEsquerda = 3)
	private Integer cstIcms;

	@Getter @Setter @Inclui(zerosEsquerda = 4)
	private Integer cfop;

	@Getter @Setter @Filho
	private RegC880 regC880;

	public RegC870(String codItem, BigDecimal qtd, String unid, Integer cstIcms, Integer cfop) {
		this.codItem = codItem;
		this.qtd = qtd;
		this.unid = unid;
		this.cstIcms = cstIcms;
		this.cfop = cfop;
	}

	public RegC870(){}

}

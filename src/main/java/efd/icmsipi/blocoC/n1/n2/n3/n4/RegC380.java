package efd.icmsipi.blocoC.n1.n2.n3.n4;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegC380 {

	@Getter @Inclui
	private final String reg = "C380";

	@Getter @Setter @Inclui
	private String codMotRestCompl;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal quantConv;

	@Getter @Setter @Inclui
	private String unid;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlUnitConv;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlUnitIcmsNaOperacaoConv;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlUnitIcmsOpConv;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlUnitIcmsOpEstoqueConv;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlUnitIcmsStEstoqueConv;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlUnitFcpIcmsStEstoqueConv;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlUnitIcmsStConvRest;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlUnitFcpStConvRest;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlUnitIcmsStConvCompl;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlUnitFcpStConvCompl;

	@Getter @Setter @Inclui(zerosEsquerda = 3)
	private Integer cstIcms;

	@Getter @Setter @Inclui(zerosEsquerda = 4)
	private Integer cfop;

	public RegC380(String codMotRestCompl, BigDecimal quantConv, String unid, BigDecimal vlUnitConv, BigDecimal vlUnitIcmsNaOperacaoConv, BigDecimal vlUnitIcmsOpConv, BigDecimal vlUnitIcmsOpEstoqueConv, BigDecimal vlUnitIcmsStEstoqueConv, BigDecimal vlUnitFcpIcmsStEstoqueConv, BigDecimal vlUnitIcmsStConvRest, BigDecimal vlUnitFcpStConvRest, BigDecimal vlUnitIcmsStConvCompl, BigDecimal vlUnitFcpStConvCompl, Integer cstIcms, Integer cfop) {
		this.codMotRestCompl = codMotRestCompl;
		this.quantConv = quantConv;
		this.unid = unid;
		this.vlUnitConv = vlUnitConv;
		this.vlUnitIcmsNaOperacaoConv = vlUnitIcmsNaOperacaoConv;
		this.vlUnitIcmsOpConv = vlUnitIcmsOpConv;
		this.vlUnitIcmsOpEstoqueConv = vlUnitIcmsOpEstoqueConv;
		this.vlUnitIcmsStEstoqueConv = vlUnitIcmsStEstoqueConv;
		this.vlUnitFcpIcmsStEstoqueConv = vlUnitFcpIcmsStEstoqueConv;
		this.vlUnitIcmsStConvRest = vlUnitIcmsStConvRest;
		this.vlUnitFcpStConvRest = vlUnitFcpStConvRest;
		this.vlUnitIcmsStConvCompl = vlUnitIcmsStConvCompl;
		this.vlUnitFcpStConvCompl = vlUnitFcpStConvCompl;
		this.cstIcms = cstIcms;
		this.cfop = cfop;
	}

	public RegC380(){}
}

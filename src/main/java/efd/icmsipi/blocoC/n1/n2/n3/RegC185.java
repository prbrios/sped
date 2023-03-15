package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC185 implements Serializable {
	private static final long serialVersionUID = 4094350999672069024L;

	@Getter @Inclui
	private final String reg = "C185";

	@Getter @Setter
	private Integer numItem;

	@Getter @Setter @Inclui
	private String codItem;

	@Getter @Setter @Inclui(zerosEsquerda = 3)
	private Integer cstIcms;

	@Getter @Setter @Inclui(zerosEsquerda = 4)
	private Integer cfop;

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
	private BigDecimal vlUnitFcpStConv;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlUnitIcmsStConvCompl;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlUnitFcpStConvCompl;

	public RegC185(Integer numItem, String codItem, Integer cstIcms, Integer cfop, String codMotRestCompl, BigDecimal quantConv, String unid, BigDecimal vlUnitConv, BigDecimal vlUnitIcmsNaOperacaoConv, BigDecimal vlUnitIcmsOpConv, BigDecimal vlUnitIcmsOpEstoqueConv, BigDecimal vlUnitIcmsStEstoqueConv, BigDecimal vlUnitFcpIcmsStEstoqueConv, BigDecimal vlUnitIcmsStConvRest, BigDecimal vlUnitFcpStConv, BigDecimal vlUnitIcmsStConvCompl, BigDecimal vlUnitFcpStConvCompl) {
		this.numItem = numItem;
		this.codItem = codItem;
		this.cstIcms = cstIcms;
		this.cfop = cfop;
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
		this.vlUnitFcpStConv = vlUnitFcpStConv;
		this.vlUnitIcmsStConvCompl = vlUnitIcmsStConvCompl;
		this.vlUnitFcpStConvCompl = vlUnitFcpStConvCompl;
	}

	public RegC185() {}

}

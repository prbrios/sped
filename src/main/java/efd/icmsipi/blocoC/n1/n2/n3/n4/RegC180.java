package efd.icmsipi.blocoC.n1.n2.n3.n4;


import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegC180 {

	@Getter @Inclui
	private final String reg = "C180";

	@Getter @Setter @Inclui
	private Integer codRespRet;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal quantConv;

	@Getter @Setter
	private String unid;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlUnitConv;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlUntiIcmsOpConv;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlUnitBcIcmsStConv;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlUnitIcmsStConv;

	@Getter @Setter @Inclui(casasDecimais = 6)
	private BigDecimal vlUnitFcpStConv;

	@Getter @Setter @Inclui
	private String codDa;

	@Getter @Setter @Inclui
	private String numDa;

	public RegC180(Integer codRespRet, BigDecimal quantConv, String unid, BigDecimal vlUnitConv, BigDecimal vlUntiIcmsOpConv, BigDecimal vlUnitBcIcmsStConv, BigDecimal vlUnitIcmsStConv, BigDecimal vlUnitFcpStConv, String codDa, String numDa) {
		this.codRespRet = codRespRet;
		this.quantConv = quantConv;
		this.unid = unid;
		this.vlUnitConv = vlUnitConv;
		this.vlUntiIcmsOpConv = vlUntiIcmsOpConv;
		this.vlUnitBcIcmsStConv = vlUnitBcIcmsStConv;
		this.vlUnitIcmsStConv = vlUnitIcmsStConv;
		this.vlUnitFcpStConv = vlUnitFcpStConv;
		this.codDa = codDa;
		this.numDa = numDa;
	}

	public RegC180(){}
}

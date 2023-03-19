package efd.icmsipi.blocoC.n1.n2.n3.n4;


import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC180 implements Serializable {
	private static final long serialVersionUID = 5499294116212694361L;

	@Inclui
	private final String reg = "C180";

	@Inclui
	private Integer codRespRet;

	@Inclui(casasDecimais = 6)
	private BigDecimal quantConv;

	@Inclui
	private String unid;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlUnitConv;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlUntiIcmsOpConv;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlUnitBcIcmsStConv;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlUnitIcmsStConv;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlUnitFcpStConv;

	@Inclui
	private String codDa;

	@Inclui
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

	public String getReg() {
		return reg;
	}

	public Integer getCodRespRet() {
		return codRespRet;
	}

	public void setCodRespRet(Integer codRespRet) {
		this.codRespRet = codRespRet;
	}

	public BigDecimal getQuantConv() {
		return quantConv;
	}

	public void setQuantConv(BigDecimal quantConv) {
		this.quantConv = quantConv;
	}

	public String getUnid() {
		return unid;
	}

	public void setUnid(String unid) {
		this.unid = unid;
	}

	public BigDecimal getVlUnitConv() {
		return vlUnitConv;
	}

	public void setVlUnitConv(BigDecimal vlUnitConv) {
		this.vlUnitConv = vlUnitConv;
	}

	public BigDecimal getVlUntiIcmsOpConv() {
		return vlUntiIcmsOpConv;
	}

	public void setVlUntiIcmsOpConv(BigDecimal vlUntiIcmsOpConv) {
		this.vlUntiIcmsOpConv = vlUntiIcmsOpConv;
	}

	public BigDecimal getVlUnitBcIcmsStConv() {
		return vlUnitBcIcmsStConv;
	}

	public void setVlUnitBcIcmsStConv(BigDecimal vlUnitBcIcmsStConv) {
		this.vlUnitBcIcmsStConv = vlUnitBcIcmsStConv;
	}

	public BigDecimal getVlUnitIcmsStConv() {
		return vlUnitIcmsStConv;
	}

	public void setVlUnitIcmsStConv(BigDecimal vlUnitIcmsStConv) {
		this.vlUnitIcmsStConv = vlUnitIcmsStConv;
	}

	public BigDecimal getVlUnitFcpStConv() {
		return vlUnitFcpStConv;
	}

	public void setVlUnitFcpStConv(BigDecimal vlUnitFcpStConv) {
		this.vlUnitFcpStConv = vlUnitFcpStConv;
	}

	public String getCodDa() {
		return codDa;
	}

	public void setCodDa(String codDa) {
		this.codDa = codDa;
	}

	public String getNumDa() {
		return numDa;
	}

	public void setNumDa(String numDa) {
		this.numDa = numDa;
	}
	
}

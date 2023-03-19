package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC815 implements Serializable {
	private static final long serialVersionUID = -8987259093504497869L;

	@Inclui
	private final String reg = "C815";

	@Inclui
	private String codMotRestCompl;

	@Inclui(casasDecimais = 6)
	private BigDecimal quantConv;

	@Inclui
	private String unid;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlUnitConv;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlUnitIcmsNaOperacaoConv;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlUnitIcmsOpConv;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlUnitIcmsOpEstoqueConv;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlUnitIcmsStEstoqueConv;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlUnitFcpIcmsStEstoqueConv;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlUnitIcmsStConvRest;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlUnitFcpStConvRest;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlUnitIcmsStConvCompl;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlUnitFcpStConvCompl;

	public RegC815(String codMotRestCompl, BigDecimal quantConv, String unid, BigDecimal vlUnitConv, BigDecimal vlUnitIcmsNaOperacaoConv, BigDecimal vlUnitIcmsOpConv, BigDecimal vlUnitIcmsOpEstoqueConv, BigDecimal vlUnitIcmsStEstoqueConv, BigDecimal vlUnitFcpIcmsStEstoqueConv, BigDecimal vlUnitIcmsStConvRest, BigDecimal vlUnitFcpStConvRest, BigDecimal vlUnitIcmsStConvCompl, BigDecimal vlUnitFcpStConvCompl) {
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
	}

	public RegC815(){}

	public String getReg() {
		return reg;
	}

	public String getCodMotRestCompl() {
		return codMotRestCompl;
	}

	public void setCodMotRestCompl(String codMotRestCompl) {
		this.codMotRestCompl = codMotRestCompl;
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

	public BigDecimal getVlUnitIcmsNaOperacaoConv() {
		return vlUnitIcmsNaOperacaoConv;
	}

	public void setVlUnitIcmsNaOperacaoConv(BigDecimal vlUnitIcmsNaOperacaoConv) {
		this.vlUnitIcmsNaOperacaoConv = vlUnitIcmsNaOperacaoConv;
	}

	public BigDecimal getVlUnitIcmsOpConv() {
		return vlUnitIcmsOpConv;
	}

	public void setVlUnitIcmsOpConv(BigDecimal vlUnitIcmsOpConv) {
		this.vlUnitIcmsOpConv = vlUnitIcmsOpConv;
	}

	public BigDecimal getVlUnitIcmsOpEstoqueConv() {
		return vlUnitIcmsOpEstoqueConv;
	}

	public void setVlUnitIcmsOpEstoqueConv(BigDecimal vlUnitIcmsOpEstoqueConv) {
		this.vlUnitIcmsOpEstoqueConv = vlUnitIcmsOpEstoqueConv;
	}

	public BigDecimal getVlUnitIcmsStEstoqueConv() {
		return vlUnitIcmsStEstoqueConv;
	}

	public void setVlUnitIcmsStEstoqueConv(BigDecimal vlUnitIcmsStEstoqueConv) {
		this.vlUnitIcmsStEstoqueConv = vlUnitIcmsStEstoqueConv;
	}

	public BigDecimal getVlUnitFcpIcmsStEstoqueConv() {
		return vlUnitFcpIcmsStEstoqueConv;
	}

	public void setVlUnitFcpIcmsStEstoqueConv(BigDecimal vlUnitFcpIcmsStEstoqueConv) {
		this.vlUnitFcpIcmsStEstoqueConv = vlUnitFcpIcmsStEstoqueConv;
	}

	public BigDecimal getVlUnitIcmsStConvRest() {
		return vlUnitIcmsStConvRest;
	}

	public void setVlUnitIcmsStConvRest(BigDecimal vlUnitIcmsStConvRest) {
		this.vlUnitIcmsStConvRest = vlUnitIcmsStConvRest;
	}

	public BigDecimal getVlUnitFcpStConvRest() {
		return vlUnitFcpStConvRest;
	}

	public void setVlUnitFcpStConvRest(BigDecimal vlUnitFcpStConvRest) {
		this.vlUnitFcpStConvRest = vlUnitFcpStConvRest;
	}

	public BigDecimal getVlUnitIcmsStConvCompl() {
		return vlUnitIcmsStConvCompl;
	}

	public void setVlUnitIcmsStConvCompl(BigDecimal vlUnitIcmsStConvCompl) {
		this.vlUnitIcmsStConvCompl = vlUnitIcmsStConvCompl;
	}

	public BigDecimal getVlUnitFcpStConvCompl() {
		return vlUnitFcpStConvCompl;
	}

	public void setVlUnitFcpStConvCompl(BigDecimal vlUnitFcpStConvCompl) {
		this.vlUnitFcpStConvCompl = vlUnitFcpStConvCompl;
	}
	

}

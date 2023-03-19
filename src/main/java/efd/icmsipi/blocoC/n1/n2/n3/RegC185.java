package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC185 implements Serializable {
	private static final long serialVersionUID = 4094350999672069024L;

	@Inclui
	private final String reg = "C185";

	@Inclui
	private Integer numItem;

	@Inclui
	private String codItem;

	@Inclui(zerosEsquerda = 3)
	private Integer cstIcms;

	@Inclui(zerosEsquerda = 4)
	private Integer cfop;

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
	private BigDecimal vlUnitFcpStConv;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlUnitIcmsStConvCompl;

	@Inclui(casasDecimais = 6)
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

	public String getReg() {
		return reg;
	}

	public Integer getNumItem() {
		return numItem;
	}

	public void setNumItem(Integer numItem) {
		this.numItem = numItem;
	}

	public String getCodItem() {
		return codItem;
	}

	public void setCodItem(String codItem) {
		this.codItem = codItem;
	}

	public Integer getCstIcms() {
		return cstIcms;
	}

	public void setCstIcms(Integer cstIcms) {
		this.cstIcms = cstIcms;
	}

	public Integer getCfop() {
		return cfop;
	}

	public void setCfop(Integer cfop) {
		this.cfop = cfop;
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

	public BigDecimal getVlUnitFcpStConv() {
		return vlUnitFcpStConv;
	}

	public void setVlUnitFcpStConv(BigDecimal vlUnitFcpStConv) {
		this.vlUnitFcpStConv = vlUnitFcpStConv;
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

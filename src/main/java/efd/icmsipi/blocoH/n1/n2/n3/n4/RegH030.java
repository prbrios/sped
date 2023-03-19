package efd.icmsipi.blocoH.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegH030 implements Serializable {
	private static final long serialVersionUID = -6769700507434948266L;

	@Inclui
	private final String reg = "H030";

	@Inclui(casasDecimais = 6)
	private BigDecimal vlIcmsOp;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlBcIcmsSt;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlIcmsSt;

	@Inclui(casasDecimais = 6)
	private BigDecimal vlFcp;

	public RegH030(BigDecimal vlIcmsOp, BigDecimal vlBcIcmsSt, BigDecimal vlIcmsSt, BigDecimal vlFcp) {
		this.vlIcmsOp = vlIcmsOp;
		this.vlBcIcmsSt = vlBcIcmsSt;
		this.vlIcmsSt = vlIcmsSt;
		this.vlFcp = vlFcp;
	}

	public RegH030(){}

	public String getReg() {
		return reg;
	}

	public BigDecimal getVlIcmsOp() {
		return vlIcmsOp;
	}

	public void setVlIcmsOp(BigDecimal vlIcmsOp) {
		this.vlIcmsOp = vlIcmsOp;
	}

	public BigDecimal getVlBcIcmsSt() {
		return vlBcIcmsSt;
	}

	public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
		this.vlBcIcmsSt = vlBcIcmsSt;
	}

	public BigDecimal getVlIcmsSt() {
		return vlIcmsSt;
	}

	public void setVlIcmsSt(BigDecimal vlIcmsSt) {
		this.vlIcmsSt = vlIcmsSt;
	}

	public BigDecimal getVlFcp() {
		return vlFcp;
	}

	public void setVlFcp(BigDecimal vlFcp) {
		this.vlFcp = vlFcp;
	}
	

}

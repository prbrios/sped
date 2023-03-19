package efd.icmsipi.blocoC.n1.n2.n3.n4;


import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC591 implements Serializable {
	private static final long serialVersionUID = -4302526889358752792L;

	@Inclui
	private final String reg = "C591";

	@Inclui(casasDecimais = 2)
	private BigDecimal vlFcpOp;

	@Inclui(casasDecimais = 2)
	private BigDecimal vlFcpSt;

	public RegC591(BigDecimal vlFcpOp, BigDecimal vlFcpSt) {
		this.vlFcpOp = vlFcpOp;
		this.vlFcpSt = vlFcpSt;
	}

	public RegC591(){}

	public String getReg() {
		return reg;
	}

	public BigDecimal getVlFcpOp() {
		return vlFcpOp;
	}

	public void setVlFcpOp(BigDecimal vlFcpOp) {
		this.vlFcpOp = vlFcpOp;
	}

	public BigDecimal getVlFcpSt() {
		return vlFcpSt;
	}

	public void setVlFcpSt(BigDecimal vlFcpSt) {
		this.vlFcpSt = vlFcpSt;
	}
	

}

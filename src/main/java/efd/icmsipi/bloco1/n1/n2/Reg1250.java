package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1255;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Reg1250 implements Serializable {
	private static final long serialVersionUID = -5124431513801082012L;

	@Inclui
	private final String reg = "1250";

	@Inclui
	private BigDecimal vlCreditoIcmsOp;

	@Inclui
	private BigDecimal vlIcmsStRest;

	@Inclui
	private BigDecimal vlFcpStRest;

	@Inclui
	private BigDecimal vlIcmsStCompl;

	@Inclui
	private BigDecimal vlFcpStCompl;

	@Filho
	private List<Reg1255> reg1255;

	public Reg1250(BigDecimal vlCreditoIcmsOp, BigDecimal vlIcmsStRest, BigDecimal vlFcpStRest, BigDecimal vlIcmsStCompl, BigDecimal vlFcpStCompl) {
		this.vlCreditoIcmsOp = vlCreditoIcmsOp;
		this.vlIcmsStRest = vlIcmsStRest;
		this.vlFcpStRest = vlFcpStRest;
		this.vlIcmsStCompl = vlIcmsStCompl;
		this.vlFcpStCompl = vlFcpStCompl;
	}

	public Reg1250(){}

	public String getReg() {
		return reg;
	}

	public BigDecimal getVlCreditoIcmsOp() {
		return vlCreditoIcmsOp;
	}

	public void setVlCreditoIcmsOp(BigDecimal vlCreditoIcmsOp) {
		this.vlCreditoIcmsOp = vlCreditoIcmsOp;
	}

	public BigDecimal getVlIcmsStRest() {
		return vlIcmsStRest;
	}

	public void setVlIcmsStRest(BigDecimal vlIcmsStRest) {
		this.vlIcmsStRest = vlIcmsStRest;
	}

	public BigDecimal getVlFcpStRest() {
		return vlFcpStRest;
	}

	public void setVlFcpStRest(BigDecimal vlFcpStRest) {
		this.vlFcpStRest = vlFcpStRest;
	}

	public BigDecimal getVlIcmsStCompl() {
		return vlIcmsStCompl;
	}

	public void setVlIcmsStCompl(BigDecimal vlIcmsStCompl) {
		this.vlIcmsStCompl = vlIcmsStCompl;
	}

	public BigDecimal getVlFcpStCompl() {
		return vlFcpStCompl;
	}

	public void setVlFcpStCompl(BigDecimal vlFcpStCompl) {
		this.vlFcpStCompl = vlFcpStCompl;
	}

	public List<Reg1255> getReg1255() {
		return reg1255;
	}

	public void setReg1255(List<Reg1255> reg1255) {
		this.reg1255 = reg1255;
	}
	
}

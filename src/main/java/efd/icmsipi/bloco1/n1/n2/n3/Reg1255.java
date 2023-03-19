package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg1255 implements Serializable {
	private static final long serialVersionUID = 6151539710686947104L;

	@Inclui
	private final String reg = "1255";

	@Inclui
	private String codMotRestCompl;

	@Inclui
	private BigDecimal vlCreditoIcmsOpMot;

	@Inclui
	private BigDecimal vlIcmsStRestMot;

	@Inclui
	private BigDecimal vlFcpStRestMot;

	@Inclui
	private BigDecimal vlIcmsStComplMot;

	@Inclui
	private BigDecimal vlFcpStComplMot;

	public Reg1255(String codMotRestCompl, BigDecimal vlCreditoIcmsOpMot, BigDecimal vlIcmsStRestMot, BigDecimal vlFcpStRestMot, BigDecimal vlIcmsStComplMot, BigDecimal vlFcpStComplMot) {
		this.codMotRestCompl = codMotRestCompl;
		this.vlCreditoIcmsOpMot = vlCreditoIcmsOpMot;
		this.vlIcmsStRestMot = vlIcmsStRestMot;
		this.vlFcpStRestMot = vlFcpStRestMot;
		this.vlIcmsStComplMot = vlIcmsStComplMot;
		this.vlFcpStComplMot = vlFcpStComplMot;
	}

	public Reg1255(){}

	public String getReg() {
		return reg;
	}

	public String getCodMotRestCompl() {
		return codMotRestCompl;
	}

	public void setCodMotRestCompl(String codMotRestCompl) {
		this.codMotRestCompl = codMotRestCompl;
	}

	public BigDecimal getVlCreditoIcmsOpMot() {
		return vlCreditoIcmsOpMot;
	}

	public void setVlCreditoIcmsOpMot(BigDecimal vlCreditoIcmsOpMot) {
		this.vlCreditoIcmsOpMot = vlCreditoIcmsOpMot;
	}

	public BigDecimal getVlIcmsStRestMot() {
		return vlIcmsStRestMot;
	}

	public void setVlIcmsStRestMot(BigDecimal vlIcmsStRestMot) {
		this.vlIcmsStRestMot = vlIcmsStRestMot;
	}

	public BigDecimal getVlFcpStRestMot() {
		return vlFcpStRestMot;
	}

	public void setVlFcpStRestMot(BigDecimal vlFcpStRestMot) {
		this.vlFcpStRestMot = vlFcpStRestMot;
	}

	public BigDecimal getVlIcmsStComplMot() {
		return vlIcmsStComplMot;
	}

	public void setVlIcmsStComplMot(BigDecimal vlIcmsStComplMot) {
		this.vlIcmsStComplMot = vlIcmsStComplMot;
	}

	public BigDecimal getVlFcpStComplMot() {
		return vlFcpStComplMot;
	}

	public void setVlFcpStComplMot(BigDecimal vlFcpStComplMot) {
		this.vlFcpStComplMot = vlFcpStComplMot;
	}
	

}

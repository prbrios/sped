package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class Reg1255 {

	@Getter
	@Inclui
	private final String reg = "1255";

	@Getter @Setter @Inclui
	private String codMotRestCompl;

	@Getter @Setter @Inclui
	private BigDecimal vlCreditoIcmsOpMot;

	@Getter @Setter @Inclui
	private BigDecimal vlIcmsStRestMot;

	@Getter @Setter @Inclui
	private BigDecimal vlFcpStRestMot;

	@Getter @Setter @Inclui
	private BigDecimal vlIcmsStComplMot;

	@Getter @Setter @Inclui
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

}

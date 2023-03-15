package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1255;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Reg1250 implements Serializable {
	private static final long serialVersionUID = -5124431513801082012L;

	@Getter @Inclui
	private final String reg = "1250";

	@Getter @Setter @Inclui
	private BigDecimal vlCreditoIcmsOp;

	@Getter @Setter @Inclui
	private BigDecimal vlIcmsStRest;

	@Getter @Setter @Inclui
	private BigDecimal vlFcpStRest;

	@Getter @Setter @Inclui
	private BigDecimal vlIcmsStCompl;

	@Getter @Setter @Inclui
	private BigDecimal vlFcpStCompl;

	@Getter @Setter @Filho
	private List<Reg1255> reg1255;

	public Reg1250(BigDecimal vlCreditoIcmsOp, BigDecimal vlIcmsStRest, BigDecimal vlFcpStRest, BigDecimal vlIcmsStCompl, BigDecimal vlFcpStCompl) {
		this.vlCreditoIcmsOp = vlCreditoIcmsOp;
		this.vlIcmsStRest = vlIcmsStRest;
		this.vlFcpStRest = vlFcpStRest;
		this.vlIcmsStCompl = vlIcmsStCompl;
		this.vlFcpStCompl = vlFcpStCompl;
	}

	public Reg1250(){}
}

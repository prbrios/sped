package efd.icmsipi.blocoC.n1.n2.n3.n4;


import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC591 implements Serializable {
	private static final long serialVersionUID = -4302526889358752792L;

	@Getter @Inclui
	private final String reg = "C591";

	@Getter @Setter @Inclui(casasDecimais = 2)
	private BigDecimal vlFcpOp;

	@Getter @Setter @Inclui(casasDecimais = 2)
	private BigDecimal vlFcpSt;

	public RegC591(BigDecimal vlFcpOp, BigDecimal vlFcpSt) {
		this.vlFcpOp = vlFcpOp;
		this.vlFcpSt = vlFcpSt;
	}

	public RegC591(){}

}

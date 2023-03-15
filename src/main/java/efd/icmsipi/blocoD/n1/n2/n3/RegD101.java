package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


public class RegD101 implements Serializable {
	private static final long serialVersionUID = -7457192667181992731L;

	@Getter @Inclui
    private final String reg = "D101";

    @Getter @Setter @Inclui
    private BigDecimal vlFcpUfDest;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsUfDest;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsUfRem;

    public RegD101(BigDecimal vlFcpUfDest, BigDecimal vlIcmsUfDest, BigDecimal vlIcmsUfRem) {
        this.vlFcpUfDest = vlFcpUfDest;
        this.vlIcmsUfDest = vlIcmsUfDest;
        this.vlIcmsUfRem = vlIcmsUfRem;
    }

    public RegD101(){}
}
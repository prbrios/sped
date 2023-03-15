package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


public class RegD697 implements Serializable {
	private static final long serialVersionUID = -6838428494805526302L;

	@Getter @Inclui
    private final String reg = "D697";

    @Getter @Setter @Inclui
    private String uf;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIcms;

    @Getter @Setter @Inclui
    private BigDecimal vlIcms;

    public RegD697(String uf, BigDecimal vlBcIcms, BigDecimal vlIcms) {
        this.uf = uf;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
    }

    public RegD697(){}
}
package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegM611 implements Serializable {
	private static final long serialVersionUID = -7748144980726390452L;

	@Getter @Inclui
	private final String reg = "M611";

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer indTipCoop;

    @Getter @Setter @Inclui
    private BigDecimal vlBcContAntExcCoop;

    @Getter @Setter @Inclui
    private BigDecimal vlExcCoopGer;

    @Getter @Setter @Inclui
    private BigDecimal vlExcEspCoop;

    @Getter @Setter @Inclui
    private BigDecimal vlBcCont;

    public RegM611(Integer indTipCoop, BigDecimal vlBcContAntExcCoop, BigDecimal vlExcCoopGer, BigDecimal vlExcEspCoop, BigDecimal vlBcCont) {
        this.indTipCoop = indTipCoop;
        this.vlBcContAntExcCoop = vlBcContAntExcCoop;
        this.vlExcCoopGer = vlExcCoopGer;
        this.vlExcEspCoop = vlExcEspCoop;
        this.vlBcCont = vlBcCont;
    }
    public RegM611(){}
}

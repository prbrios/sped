package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegM211 {

    @Getter @Inclui
    private final String reg = "M211";

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer indTipCoop;

    @Getter @Inclui
    private BigDecimal vlBcContAntExcCoop;

    @Getter @Inclui
    private BigDecimal vlExcCoopGer;

    @Getter @Inclui
    private BigDecimal vlExcEspCoop;

    @Getter @Inclui
    private BigDecimal vlBcCont;

    public RegM211(Integer indTipCoop, BigDecimal vlBcContAntExcCoop, BigDecimal vlExcCoopGer, BigDecimal vlExcEspCoop, BigDecimal vlBcCont) {
        this.indTipCoop = indTipCoop;
        this.vlBcContAntExcCoop = vlBcContAntExcCoop;
        this.vlExcCoopGer = vlExcCoopGer;
        this.vlExcEspCoop = vlExcEspCoop;
        this.vlBcCont = vlBcCont;
    }

    public RegM211(){}
}

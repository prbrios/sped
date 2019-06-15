package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegM211 {

    @Inclui
    private final String reg = "M211";

    @Inclui(zerosEsquerda = 2)
    private Integer indTipCoop;

    @Inclui
    private BigDecimal vlBcContAntExcCoop;

    @Inclui
    private BigDecimal vlExcCoopGer;

    @Inclui
    private BigDecimal vlExcEspCoop;

    @Inclui
    private BigDecimal vlBcCont;

}

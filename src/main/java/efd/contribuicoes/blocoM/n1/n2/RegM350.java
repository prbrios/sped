package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegM350 {

    @Inclui
    private final String reg = "M350";

    @Inclui
    private BigDecimal vlTotFol;

    @Inclui
    private BigDecimal vlExcBc;

    @Inclui
    private BigDecimal vlTotBc;

    @Inclui
    private BigDecimal aliqPisFol;

    @Inclui
    private BigDecimal vlTotContFol;

}

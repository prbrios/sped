package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegM350 {

    @Getter @Inclui
    private final String reg = "M350";

    @Getter @Inclui
    private BigDecimal vlTotFol;

    @Getter @Inclui
    private BigDecimal vlExcBc;

    @Getter @Inclui
    private BigDecimal vlTotBc;

    @Getter @Inclui
    private BigDecimal aliqPisFol;

    @Getter @Inclui
    private BigDecimal vlTotContFol;

    public RegM350(BigDecimal vlTotFol, BigDecimal vlExcBc, BigDecimal vlTotBc, BigDecimal aliqPisFol, BigDecimal vlTotContFol) {
        this.vlTotFol = vlTotFol;
        this.vlExcBc = vlExcBc;
        this.vlTotBc = vlTotBc;
        this.aliqPisFol = aliqPisFol;
        this.vlTotContFol = vlTotContFol;
    }

    public RegM350(){}
}

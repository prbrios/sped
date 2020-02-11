package efd.contribuicoes.blocoM.n1.n2;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegM350 {

    @Getter @Inclui
private final String reg = "M350";

    @Getter @Setter @Inclui
    private BigDecimal vlTotFol;

    @Getter @Setter @Inclui
    private BigDecimal vlExcBc;

    @Getter @Setter @Inclui
    private BigDecimal vlTotBc;

    @Getter @Setter @Inclui
    private BigDecimal aliqPisFol;

    @Getter @Setter @Inclui
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

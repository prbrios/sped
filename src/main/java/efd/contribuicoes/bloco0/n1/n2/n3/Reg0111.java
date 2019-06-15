package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class Reg0111 {

    @Getter @Inclui
    private final String reg = "0111";

    @Getter @Inclui
    private BigDecimal recBruNcumTribMi;

    @Getter @Inclui
    private BigDecimal recBruNcumNtMi;

    @Getter @Inclui
    private BigDecimal recBruNcumExp;

    @Getter @Inclui
    private BigDecimal recBruCum;

    @Getter @Inclui
    private BigDecimal recBruTotal;

    public Reg0111(BigDecimal recBruNcumTribMi, BigDecimal recBruNcumNtMi, BigDecimal recBruNcumExp, BigDecimal recBruCum, BigDecimal recBruTotal) {
        this.recBruNcumTribMi = recBruNcumTribMi;
        this.recBruNcumNtMi = recBruNcumNtMi;
        this.recBruNcumExp = recBruNcumExp;
        this.recBruCum = recBruCum;
        this.recBruTotal = recBruTotal;
    }

    public Reg0111(){}
}

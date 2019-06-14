package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Reg0111 {

    @Inclui
    private final String reg = "0111";

    @Inclui
    private BigDecimal recBruNcumTribMi;

    @Inclui
    private BigDecimal recBruNcumNtMi;

    @Inclui
    private BigDecimal recBruNcumExp;

    @Inclui
    private BigDecimal recBruCum;

    @Inclui
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

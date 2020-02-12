package efd.contribuicoes.bloco0.n1.n2.n3;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0111 {

    @Getter @Inclui
private final String reg = "0111";

    @Getter @Setter @Inclui
    private BigDecimal recBruNcumTribMi;

    @Getter @Setter @Inclui
    private BigDecimal recBruNcumNtMi;

    @Getter @Setter @Inclui
    private BigDecimal recBruNcumExp;

    @Getter @Setter @Inclui
    private BigDecimal recBruCum;

    @Getter @Setter @Inclui
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

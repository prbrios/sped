package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Reg1975 {

    @Inclui
    private final String reg = "1975";

    @Inclui
    private BigDecimal aliqImpBase;

    @Inclui
    private BigDecimal g310;

    @Inclui
    private BigDecimal g311;

    @Inclui
    private BigDecimal g312;

    public Reg1975(BigDecimal aliqImpBase, BigDecimal g310, BigDecimal g311, BigDecimal g312) {
        this.aliqImpBase = aliqImpBase;
        this.g310 = g310;
        this.g311 = g311;
        this.g312 = g312;
    }

    public Reg1975(){}

}
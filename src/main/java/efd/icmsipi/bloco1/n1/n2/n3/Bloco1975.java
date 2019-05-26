package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Bloco1975 {

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

}
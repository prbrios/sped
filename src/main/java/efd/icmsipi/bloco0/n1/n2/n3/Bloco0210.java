package efd.icmsipi.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Bloco0210 {

    @Inclui
    private final String reg = "0210";

    @Inclui
    private String codItemComp;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdComp;

    @Inclui(casasDecimais = 4)
    private BigDecimal perda;

}

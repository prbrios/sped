package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class BlocoC171 {

    @Inclui
    private final String reg = "C171";

    @Inclui
    private String numTanque;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtde;

}

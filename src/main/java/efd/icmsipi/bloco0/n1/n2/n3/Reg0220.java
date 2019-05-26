package efd.icmsipi.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Reg0220 {

    @Inclui
    private final String reg = "0220";

    @Inclui
    private String unidConv;

    @Inclui(casasDecimais = 6)
    private BigDecimal fatConv;

}

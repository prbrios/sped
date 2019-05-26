package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC178 {

    @Inclui
    private final String reg = "C178";

    @Inclui
    private String clEnq;

    @Inclui
    private BigDecimal vlUnid;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantPad;

}

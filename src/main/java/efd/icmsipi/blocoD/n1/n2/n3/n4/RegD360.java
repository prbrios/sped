package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegD360 {

    @Inclui
    private final String reg = "D360";

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

}
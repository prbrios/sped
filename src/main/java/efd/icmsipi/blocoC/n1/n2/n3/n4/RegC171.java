package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class RegC171 {

    @Inclui
    private final String reg = "C171";

    @Inclui
    private String numTanque;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtde;

    public RegC171(String numTanque, BigDecimal qtde) {
        this.numTanque = numTanque;
        this.qtde = qtde;
    }

    public RegC171(){}
}

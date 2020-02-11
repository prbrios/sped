package efd.icmsipi.blocoC.n1.n2.n3.n4;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegC171 {

    @Getter @Inclui
    private final String reg = "C171";

    @Getter @Setter @Inclui
    private String numTanque;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal qtde;

    public RegC171(String numTanque, BigDecimal qtde) {
        this.numTanque = numTanque;
        this.qtde = qtde;
    }

    public RegC171(){}
}

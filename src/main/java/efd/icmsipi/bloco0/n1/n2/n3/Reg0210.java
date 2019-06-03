package efd.icmsipi.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Reg0210 {

    @Inclui
    private final String reg = "0210";

    @Inclui
    private String codItemComp;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdComp;

    @Inclui(casasDecimais = 4)
    private BigDecimal perda;

    public Reg0210(String codItemComp, BigDecimal qtdComp, BigDecimal perda) {
        this.codItemComp = codItemComp;
        this.qtdComp = qtdComp;
        this.perda = perda;
    }

    public Reg0210(){}

}

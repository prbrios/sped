package efd.icmsipi.bloco0.n1.n2.n3;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg0210 {

    @Getter @Inclui
    private final String reg = "0210";

    @Getter @Setter @Inclui
    private String codItemComp;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal qtdComp;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal perda;

    public Reg0210(String codItemComp, BigDecimal qtdComp, BigDecimal perda) {
        this.codItemComp = codItemComp;
        this.qtdComp = qtdComp;
        this.perda = perda;
    }

    public Reg0210(){}

}

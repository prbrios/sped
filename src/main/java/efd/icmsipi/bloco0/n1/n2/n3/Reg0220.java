package efd.icmsipi.bloco0.n1.n2.n3;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg0220 {

    @Getter @Inclui
    private final String reg = "0220";

    @Getter @Setter @Inclui
    private String unidConv;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal fatConv;

    public Reg0220(String unidConv, BigDecimal fatConv) {
        this.unidConv = unidConv;
        this.fatConv = fatConv;
    }

    public Reg0220(){}

}

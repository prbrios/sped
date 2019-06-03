package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class RegC120 {

    @Inclui
    private final String reg = "C120";

    @Inclui
    private String codDocImp;

    @Inclui
    private String numDocImp;

    @Inclui
    private BigDecimal pisImp;

    @Inclui
    private BigDecimal cofinsImp;

    @Inclui
    private String numAcdraw;

    public RegC120(String codDocImp, String numDocImp, BigDecimal pisImp, BigDecimal cofinsImp, String numAcdraw) {
        this.codDocImp = codDocImp;
        this.numDocImp = numDocImp;
        this.pisImp = pisImp;
        this.cofinsImp = cofinsImp;
        this.numAcdraw = numAcdraw;
    }

    public RegC120(){}
}

package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Reg1800 {

    @Inclui
    private final String reg = "1800";

    @Inclui
    private BigDecimal vlCarga;

    @Inclui
    private BigDecimal vlPass;

    @Inclui
    private BigDecimal vlFat;

    @Inclui(casasDecimais = 6)
    private BigDecimal indRat;

    @Inclui
    private BigDecimal vlIcmsAnt;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcmsApur;

    @Inclui
    private BigDecimal vlBcIcmsApur;

    @Inclui
    private BigDecimal vlDif;

}
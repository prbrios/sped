package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BlocoE520 {

    @Inclui
    private final String reg = "E520";

    @Inclui
    private BigDecimal vlSdAntIpi;

    @Inclui
    private BigDecimal vlDebIpi;

    @Inclui
    private BigDecimal vlCredIpi;

    @Inclui
    private BigDecimal vlodIpi;

    @Inclui
    private BigDecimal vlOcIpi;

    @Inclui
    private BigDecimal vlScIpi;

    @Inclui
    private BigDecimal vlSdIpi;

}
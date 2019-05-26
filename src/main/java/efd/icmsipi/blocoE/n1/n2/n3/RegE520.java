package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE530;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class RegE520 {

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

    @Filho
    private List<RegE530> regE530;

}
package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegD101 {

    @Inclui
    private final String reg = "D101";

    @Inclui
    private BigDecimal vlFcpUfDest;

    @Inclui
    private BigDecimal vlIcmsUfDest;

    @Inclui
    private BigDecimal vlIcmsUfRem;

}
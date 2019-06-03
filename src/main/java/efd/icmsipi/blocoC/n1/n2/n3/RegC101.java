package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC101 {

    @Inclui
    private final String reg = "C101";

    @Inclui
    private BigDecimal vlFcpUfDest;

    @Inclui
    private BigDecimal vlIcmsUfDest;

    @Inclui
    private BigDecimal vlIcmsUfRem;

    public RegC101(BigDecimal vlFcpUfDest, BigDecimal vlIcmsUfDest, BigDecimal vlIcmsUfRem) {
        this.vlFcpUfDest = vlFcpUfDest;
        this.vlIcmsUfDest = vlIcmsUfDest;
        this.vlIcmsUfRem = vlIcmsUfRem;
    }

    public RegC101(){}
}

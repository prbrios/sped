package efd.icmsipi.blocoC.n1.n2.n3;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegC101 {

    @Getter @Inclui
    private final String reg = "C101";

    @Getter @Setter @Inclui
    private BigDecimal vlFcpUfDest;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsUfDest;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsUfRem;

    public RegC101(BigDecimal vlFcpUfDest, BigDecimal vlIcmsUfDest, BigDecimal vlIcmsUfRem) {
        this.vlFcpUfDest = vlFcpUfDest;
        this.vlIcmsUfDest = vlIcmsUfDest;
        this.vlIcmsUfRem = vlIcmsUfRem;
    }

    public RegC101(){}
}

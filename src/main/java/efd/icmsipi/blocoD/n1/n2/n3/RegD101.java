package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegD101 {

    @Getter @Inclui
    private final String reg = "D101";

    @Getter @Setter @Inclui
    private BigDecimal vlFcpUfDest;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsUfDest;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsUfRem;

    public RegD101(BigDecimal vlFcpUfDest, BigDecimal vlIcmsUfDest, BigDecimal vlIcmsUfRem) {
        this.vlFcpUfDest = vlFcpUfDest;
        this.vlIcmsUfDest = vlIcmsUfDest;
        this.vlIcmsUfRem = vlIcmsUfRem;
    }

    public RegD101(){}
}
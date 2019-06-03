package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegB420 {

    @Inclui
    private final String reg = "B420";

    @Inclui
    private BigDecimal vlCont;

    @Inclui
    private BigDecimal vlBcIss;

    @Inclui
    private BigDecimal aliqIss;

    @Inclui
    private BigDecimal vlIsntIss;

    @Inclui
    private BigDecimal vlIss;

    @Inclui
    private String codServ;

    public RegB420(BigDecimal vlCont, BigDecimal vlBcIss, BigDecimal aliqIss, BigDecimal vlIsntIss, BigDecimal vlIss, String codServ) {
        this.vlCont = vlCont;
        this.vlBcIss = vlBcIss;
        this.aliqIss = aliqIss;
        this.vlIsntIss = vlIsntIss;
        this.vlIss = vlIss;
        this.codServ = codServ;
    }

    public RegB420(){}
}

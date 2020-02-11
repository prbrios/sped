package efd.icmsipi.blocoB.n1.n2;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegB420 {

    @Getter @Inclui
    private final String reg = "B420";

    @Getter @Setter @Inclui
    private BigDecimal vlCont;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIss;

    @Getter @Setter @Inclui
    private BigDecimal aliqIss;

    @Getter @Setter @Inclui
    private BigDecimal vlIsntIss;

    @Getter @Setter @Inclui
    private BigDecimal vlIss;

    @Getter @Setter @Inclui
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

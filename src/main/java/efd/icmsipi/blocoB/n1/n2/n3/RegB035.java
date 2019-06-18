package efd.icmsipi.blocoB.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegB035 {

    @Getter @Inclui
    private final String reg = "B035";

    @Getter @Setter @Inclui
    private BigDecimal vlContP;

    @Getter @Setter @Inclui
    private BigDecimal vlBcIssP;

    @Getter @Setter @Inclui
    private BigDecimal aliqIss;

    @Getter @Setter @Inclui
    private BigDecimal vlIssP;

    @Getter @Setter @Inclui
    private BigDecimal vlIsntIssP;

    @Getter @Setter @Inclui
    private String codServ;

    public RegB035(BigDecimal vlContP, BigDecimal vlBcIssP, BigDecimal aliqIss, BigDecimal vlIssP, BigDecimal vlIsntIssP, String codServ) {
        this.vlContP = vlContP;
        this.vlBcIssP = vlBcIssP;
        this.aliqIss = aliqIss;
        this.vlIssP = vlIssP;
        this.vlIsntIssP = vlIsntIssP;
        this.codServ = codServ;
    }

    public RegB035(){}
}

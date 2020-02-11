package efd.icmsipi.blocoB.n1.n2.n3;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegB025 {

    @Getter @Inclui
    private final String reg = "B025";

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

    public RegB025(BigDecimal vlContP, BigDecimal vlBcIssP, BigDecimal aliqIss, BigDecimal vlIssP, BigDecimal vlIsntIssP, String codServ) {
        this.vlContP = vlContP;
        this.vlBcIssP = vlBcIssP;
        this.aliqIss = aliqIss;
        this.vlIssP = vlIssP;
        this.vlIsntIssP = vlIsntIssP;
        this.codServ = codServ;
    }

    public RegB025(){}
}

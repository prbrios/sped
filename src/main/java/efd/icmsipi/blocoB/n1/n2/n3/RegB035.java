package efd.icmsipi.blocoB.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegB035 {

    @Inclui
    private final String reg = "B035";

    @Inclui
    private BigDecimal vlContP;

    @Inclui
    private BigDecimal vlBcIssP;

    @Inclui
    private BigDecimal aliqIss;

    @Inclui
    private BigDecimal vlIssP;

    @Inclui
    private BigDecimal vlIsntIssP;

    @Inclui
    private String codServ;

}

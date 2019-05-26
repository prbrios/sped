package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BlocoD197 {

    @Inclui
    private final String reg = "D197";

    @Inclui
    private String codAj;

    @Inclui
    private String descrComplAj;

    @Inclui
    private String codItem;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlOutros;

}
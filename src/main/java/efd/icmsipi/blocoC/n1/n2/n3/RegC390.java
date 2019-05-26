package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC390 {

    @Inclui
    private final String reg = "C390";

    @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private BigDecimal vlOpr;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlRedBc;

    @Inclui
    private String codObs;

}
package efd.contribuicoes.blocoF.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegF210 {

    @Inclui
    private final String reg = "F210";

    @Inclui
    private BigDecimal vlCusOrc;

    @Inclui
    private BigDecimal vlExc;

    @Inclui
    private BigDecimal vlCusOrcAju;

    @Inclui
    private BigDecimal vlBcCred;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlCredPisUtil;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCredCofinsUtil;

}

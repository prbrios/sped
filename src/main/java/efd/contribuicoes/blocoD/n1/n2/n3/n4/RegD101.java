package efd.contribuicoes.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegD101 {

    @Inclui
    private final String reg = "D101";

    @Inclui
    private String indNatFrt;

    @Inclui
    private BigDecimal vlItem;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui
    private String natBcCred;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private String codCta;

}

package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegM105 {

    @Inclui
    private final String reg = "M105";

    @Inclui
    private String natBcCred;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui
    private BigDecimal vlBcPisTot;

    @Inclui
    private BigDecimal vlBcPisCum;

    @Inclui
    private BigDecimal vlbcPisNc;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPisTot;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Inclui
    private String descCred;

}

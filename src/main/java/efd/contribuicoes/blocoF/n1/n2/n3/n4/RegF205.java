package efd.contribuicoes.blocoF.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegF205 {

    @Inclui
    private final String reg = "F205";

    @Inclui
    private BigDecimal vlCusIncAcumAnt;

    @Inclui
    private BigDecimal vlCusIncPerEsc;

    @Inclui
    private BigDecimal vlCusIncAcum;

    @Inclui
    private BigDecimal vlExcBcCusIncAcum;

    @Inclui
    private BigDecimal vlBcCusInc;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlCredPisAcum;

    @Inclui
    private BigDecimal vlCredPisDescAnt;

    @Inclui
    private BigDecimal vlCredPisDesc;

    @Inclui
    private BigDecimal vlCredPisDescFut;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCredCofinsAcum;

    @Inclui
    private BigDecimal vlCredCofinsDescAnt;

    @Inclui
    private BigDecimal vlCredCofinsDesc;

    @Inclui
    private BigDecimal vlCredCofinsDescFut;

}

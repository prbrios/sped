package efd.contribuicoes.blocoF.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegF205 {

    @Getter @Inclui
    private final String reg = "F205";

    @Getter @Inclui
    private BigDecimal vlCusIncAcumAnt;

    @Getter @Inclui
    private BigDecimal vlCusIncPerEsc;

    @Getter @Inclui
    private BigDecimal vlCusIncAcum;

    @Getter @Inclui
    private BigDecimal vlExcBcCusIncAcum;

    @Getter @Inclui
    private BigDecimal vlBcCusInc;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Inclui
    private BigDecimal vlCredPisAcum;

    @Getter @Inclui
    private BigDecimal vlCredPisDescAnt;

    @Getter @Inclui
    private BigDecimal vlCredPisDesc;

    @Getter @Inclui
    private BigDecimal vlCredPisDescFut;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Inclui
    private BigDecimal vlCredCofinsAcum;

    @Getter @Inclui
    private BigDecimal vlCredCofinsDescAnt;

    @Getter @Inclui
    private BigDecimal vlCredCofinsDesc;

    @Getter @Inclui
    private BigDecimal vlCredCofinsDescFut;

    public RegF205(BigDecimal vlCusIncAcumAnt, BigDecimal vlCusIncPerEsc, BigDecimal vlCusIncAcum, BigDecimal vlExcBcCusIncAcum, BigDecimal vlBcCusInc, Integer cstPis, BigDecimal aliqPis, BigDecimal vlCredPisAcum, BigDecimal vlCredPisDescAnt, BigDecimal vlCredPisDesc, BigDecimal vlCredPisDescFut, Integer cstCofins, BigDecimal aliqCofins, BigDecimal vlCredCofinsAcum, BigDecimal vlCredCofinsDescAnt, BigDecimal vlCredCofinsDesc, BigDecimal vlCredCofinsDescFut) {
        this.vlCusIncAcumAnt = vlCusIncAcumAnt;
        this.vlCusIncPerEsc = vlCusIncPerEsc;
        this.vlCusIncAcum = vlCusIncAcum;
        this.vlExcBcCusIncAcum = vlExcBcCusIncAcum;
        this.vlBcCusInc = vlBcCusInc;
        this.cstPis = cstPis;
        this.aliqPis = aliqPis;
        this.vlCredPisAcum = vlCredPisAcum;
        this.vlCredPisDescAnt = vlCredPisDescAnt;
        this.vlCredPisDesc = vlCredPisDesc;
        this.vlCredPisDescFut = vlCredPisDescFut;
        this.cstCofins = cstCofins;
        this.aliqCofins = aliqCofins;
        this.vlCredCofinsAcum = vlCredCofinsAcum;
        this.vlCredCofinsDescAnt = vlCredCofinsDescAnt;
        this.vlCredCofinsDesc = vlCredCofinsDesc;
        this.vlCredCofinsDescFut = vlCredCofinsDescFut;
    }

    public RegF205(){}
}

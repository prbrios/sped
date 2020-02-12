package efd.contribuicoes.blocoF.n1.n2.n3.n4;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegF205 {

    @Getter @Inclui
private final String reg = "F205";

    @Getter @Setter @Inclui
    private BigDecimal vlCusIncAcumAnt;

    @Getter @Setter @Inclui
    private BigDecimal vlCusIncPerEsc;

    @Getter @Setter @Inclui
    private BigDecimal vlCusIncAcum;

    @Getter @Setter @Inclui
    private BigDecimal vlExcBcCusIncAcum;

    @Getter @Setter @Inclui
    private BigDecimal vlBcCusInc;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Setter @Inclui
    private BigDecimal vlCredPisAcum;

    @Getter @Setter @Inclui
    private BigDecimal vlCredPisDescAnt;

    @Getter @Setter @Inclui
    private BigDecimal vlCredPisDesc;

    @Getter @Setter @Inclui
    private BigDecimal vlCredPisDescFut;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlCredCofinsAcum;

    @Getter @Setter @Inclui
    private BigDecimal vlCredCofinsDescAnt;

    @Getter @Setter @Inclui
    private BigDecimal vlCredCofinsDesc;

    @Getter @Setter @Inclui
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

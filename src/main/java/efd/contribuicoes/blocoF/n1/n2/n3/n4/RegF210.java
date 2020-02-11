package efd.contribuicoes.blocoF.n1.n2.n3.n4;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegF210 {

    @Getter @Inclui
private final String reg = "F210";

    @Getter @Setter @Inclui
    private BigDecimal vlCusOrc;

    @Getter @Setter @Inclui
    private BigDecimal vlExc;

    @Getter @Setter @Inclui
    private BigDecimal vlCusOrcAju;

    @Getter @Setter @Inclui
    private BigDecimal vlBcCred;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Setter @Inclui
    private BigDecimal vlCredPisUtil;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlCredCofinsUtil;

    public RegF210(BigDecimal vlCusOrc, BigDecimal vlExc, BigDecimal vlCusOrcAju, BigDecimal vlBcCred, Integer cstPis, BigDecimal aliqPis, BigDecimal vlCredPisUtil, Integer cstCofins, BigDecimal aliqCofins, BigDecimal vlCredCofinsUtil) {
        this.vlCusOrc = vlCusOrc;
        this.vlExc = vlExc;
        this.vlCusOrcAju = vlCusOrcAju;
        this.vlBcCred = vlBcCred;
        this.cstPis = cstPis;
        this.aliqPis = aliqPis;
        this.vlCredPisUtil = vlCredPisUtil;
        this.cstCofins = cstCofins;
        this.aliqCofins = aliqCofins;
        this.vlCredCofinsUtil = vlCredCofinsUtil;
    }

    public RegF210(){}
}

package efd.contribuicoes.blocoF.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegF210 {

    @Getter @Inclui
    private final String reg = "F210";

    @Getter @Inclui
    private BigDecimal vlCusOrc;

    @Getter @Inclui
    private BigDecimal vlExc;

    @Getter @Inclui
    private BigDecimal vlCusOrcAju;

    @Getter @Inclui
    private BigDecimal vlBcCred;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Inclui
    private BigDecimal vlCredPisUtil;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Inclui
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

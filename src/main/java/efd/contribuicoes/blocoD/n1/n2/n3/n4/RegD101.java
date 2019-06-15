package efd.contribuicoes.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegD101 {

    @Getter @Inclui
    private final String reg = "D101";

    @Getter @Inclui
    private String indNatFrt;

    @Getter @Inclui
    private BigDecimal vlItem;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui
    private String natBcCred;

    @Getter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Getter @Inclui
    private BigDecimal vlPis;

    @Getter @Inclui
    private String codCta;

    public RegD101(String indNatFrt, BigDecimal vlItem, Integer cstPis, String natBcCred, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, String codCta) {
        this.indNatFrt = indNatFrt;
        this.vlItem = vlItem;
        this.cstPis = cstPis;
        this.natBcCred = natBcCred;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.codCta = codCta;
    }

    public RegD101(){}
}

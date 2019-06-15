package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegM105 {

    @Getter @Inclui
    private final String reg = "M105";

    @Getter @Inclui
    private String natBcCred;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui
    private BigDecimal vlBcPisTot;

    @Getter @Inclui
    private BigDecimal vlBcPisCum;

    @Getter @Inclui
    private BigDecimal vlbcPisNc;

    @Getter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPisTot;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Getter @Inclui
    private String descCred;

    public RegM105(String natBcCred, Integer cstPis, BigDecimal vlBcPisTot, BigDecimal vlBcPisCum, BigDecimal vlbcPisNc, BigDecimal vlBcPis, BigDecimal quantBcPisTot, BigDecimal quantBcPis, String descCred) {
        this.natBcCred = natBcCred;
        this.cstPis = cstPis;
        this.vlBcPisTot = vlBcPisTot;
        this.vlBcPisCum = vlBcPisCum;
        this.vlbcPisNc = vlbcPisNc;
        this.vlBcPis = vlBcPis;
        this.quantBcPisTot = quantBcPisTot;
        this.quantBcPis = quantBcPis;
        this.descCred = descCred;
    }

    public RegM105(){}
}

package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegM105 implements Serializable {
	private static final long serialVersionUID = -7642051819185099515L;

	@Getter @Inclui
    private final String reg = "M105";

    @Getter @Setter @Inclui
    private String natBcCred;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Setter @Inclui
    private BigDecimal vlBcPisTot;

    @Getter @Setter @Inclui
    private BigDecimal vlBcPisCum;

    @Getter @Setter @Inclui
    private BigDecimal vlbcPisNc;

    @Getter @Setter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPisTot;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Getter @Setter @Inclui
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

package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegM505 {

    @Getter @Inclui
    private final String reg = "M505";

    @Getter @Inclui
    private String natBcCred;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui
    private BigDecimal vlBcCofinsTot;

    @Getter @Inclui
    private BigDecimal vlBcCofinsCum;

    @Getter @Inclui
    private BigDecimal vlBcCofinsNc;

    @Getter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofinsTot;

    @Getter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    @Getter @Inclui
    private String descCred;

    public RegM505(String natBcCred, Integer cstCofins, BigDecimal vlBcCofinsTot, BigDecimal vlBcCofinsCum, BigDecimal vlBcCofinsNc, BigDecimal vlBcCofins, BigDecimal quantBcCofinsTot, BigDecimal quantBcCofins, String descCred) {
        this.natBcCred = natBcCred;
        this.cstCofins = cstCofins;
        this.vlBcCofinsTot = vlBcCofinsTot;
        this.vlBcCofinsCum = vlBcCofinsCum;
        this.vlBcCofinsNc = vlBcCofinsNc;
        this.vlBcCofins = vlBcCofins;
        this.quantBcCofinsTot = quantBcCofinsTot;
        this.quantBcCofins = quantBcCofins;
        this.descCred = descCred;
    }

    public RegM505(){ }
}

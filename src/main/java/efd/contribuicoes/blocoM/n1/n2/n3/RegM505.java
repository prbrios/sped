package efd.contribuicoes.blocoM.n1.n2.n3;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegM505 {

    @Getter @Inclui
private final String reg = "M505";

    @Getter @Setter @Inclui
    private String natBcCred;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlBcCofinsTot;

    @Getter @Setter @Inclui
    private BigDecimal vlBcCofinsCum;

    @Getter @Setter @Inclui
    private BigDecimal vlBcCofinsNc;

    @Getter @Setter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofinsTot;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    @Getter @Setter @Inclui
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

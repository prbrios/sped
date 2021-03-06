package efd.contribuicoes.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegD105 {

    @Getter @Inclui
private final String reg = "D105";

    @Getter @Setter @Inclui
    private String indNatFrt;

    @Getter @Setter @Inclui
    private BigDecimal vlItem;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Setter @Inclui
    private String natBcCred;

    @Getter @Setter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private String codCta;

    public RegD105(String indNatFrt, BigDecimal vlItem, Integer cstCofins, String natBcCred, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String codCta) {
        this.indNatFrt = indNatFrt;
        this.vlItem = vlItem;
        this.cstCofins = cstCofins;
        this.natBcCred = natBcCred;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
    }

    public RegD105(){}
}

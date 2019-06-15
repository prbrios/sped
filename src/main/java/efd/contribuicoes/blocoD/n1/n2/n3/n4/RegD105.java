package efd.contribuicoes.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegD105 {

    @Getter @Inclui
    private final String reg = "D105";

    @Getter @Inclui
    private String indNatFrt;

    @Getter @Inclui
    private BigDecimal vlItem;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui
    private String natBcCred;

    @Getter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Inclui
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

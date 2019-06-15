package efd.contribuicoes.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegD205 {

    private final String reg = "D205";

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui
    private BigDecimal vlItem;

    @Getter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Getter @Inclui
    private BigDecimal vlCofins;

    @Getter @Inclui
    private String codCta;

    public RegD205(Integer cstCofins, BigDecimal vlItem, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String codCta) {
        this.cstCofins = cstCofins;
        this.vlItem = vlItem;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
    }

    public RegD205(){ }
}

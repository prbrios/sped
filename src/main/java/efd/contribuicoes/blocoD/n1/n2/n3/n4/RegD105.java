package efd.contribuicoes.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegD105 {

    @Inclui
    private final String reg = "D105";

    @Inclui
    private String indNatFrt;

    @Inclui
    private BigDecimal vlItem;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui
    private String natBcCred;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codCta;

}

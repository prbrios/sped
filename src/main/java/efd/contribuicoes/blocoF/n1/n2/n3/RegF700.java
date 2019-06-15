package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegF700 {

    @Inclui
    private final String reg = "F700";

    @Inclui(zerosEsquerda = 2)
    private Integer indOriDed;

    @Inclui
    private Integer indNatDed;

    @Inclui
    private BigDecimal vlDedPis;

    @Inclui
    private BigDecimal vlDedCofins;

    @Inclui
    private BigDecimal vlBcOper;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private String infComp;

}

package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegM505 {

    @Inclui
    private final String reg = "M505";

    @Inclui
    private String natBcCred;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui
    private BigDecimal vlBcCofinsTot;

    @Inclui
    private BigDecimal vlBcCofinsCum;

    @Inclui
    private BigDecimal vlBcCofinsNc;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofinsTot;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    @Inclui
    private String descCred;


}

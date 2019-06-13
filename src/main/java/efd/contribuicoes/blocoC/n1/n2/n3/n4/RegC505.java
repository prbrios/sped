package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC505 {

    @Inclui
    private final String reg = "C505";

    @Inclui
    private Integer cstCofins;

    @Inclui
    private BigDecimal vlItem;

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

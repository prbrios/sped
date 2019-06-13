package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC396 {

    @Inclui
    private final String reg = "C396";

    @Inclui
    private String codItem;

    @Inclui
    private BigDecimal vlItem;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private String natBcCred;

    @Inclui
    private Integer cstPis;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private Integer cstCofins;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codCta;

}

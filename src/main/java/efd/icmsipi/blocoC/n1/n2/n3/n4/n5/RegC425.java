package efd.icmsipi.blocoC.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC425 {

    @Inclui
    private final String reg = "C425";

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Inclui
    private String unid;

    @Inclui
    private BigDecimal vlItem;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

}
package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC199 {

    @Inclui
    private final String reg = "C199";

    @Inclui
    private String codDocImp;

    @Inclui
    private String numDocImp;

    @Inclui
    private BigDecimal vlPisImp;

    @Inclui
    private BigDecimal vlCofinsImp;

    @Inclui
    private String numAcdraw;

}

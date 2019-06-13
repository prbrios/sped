package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegC120 {

    @Filho
    private final String reg = "C120";

    @Inclui
    private String codDocImp;

    @Filho
    private String numDocImp;

    @Inclui
    private BigDecimal vlPisImp;

    @Filho
    private BigDecimal vlCofinsImp;

    @Inclui
    private String numAcdRaw;

}

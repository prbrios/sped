package efd.contribuicoes.blocoA.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegA120 {

    @Inclui
    private final String reg = "A120";

    @Inclui
    private BigDecimal vlTotServ;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui
    private BigDecimal vlPisImp;

    @Inclui
    private LocalDate dtPagPis;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui
    private BigDecimal vlCofinsImp;

    @Inclui
    private LocalDate dtPagCofins;

    @Inclui
    private String locExeServ;

}

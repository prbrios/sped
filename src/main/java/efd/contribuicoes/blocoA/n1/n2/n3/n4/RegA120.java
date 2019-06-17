package efd.contribuicoes.blocoA.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

public class RegA120 {

    @Getter @Inclui
private final String reg = "A120";

    @Getter @Setter @Inclui
    private BigDecimal vlTotServ;

    @Getter @Setter @Inclui
    private BigDecimal vlBcPis;

    @Getter @Setter @Inclui
    private BigDecimal vlPisImp;

    @Getter @Setter @Inclui
    private LocalDate dtPagPis;

    @Getter @Setter @Inclui
    private BigDecimal vlBcCofins;

    @Getter @Setter @Inclui
    private BigDecimal vlCofinsImp;

    @Getter @Setter @Inclui
    private LocalDate dtPagCofins;

    @Getter @Setter @Inclui
    private String locExeServ;

    public RegA120(BigDecimal vlTotServ, BigDecimal vlBcPis, BigDecimal vlPisImp, LocalDate dtPagPis, BigDecimal vlBcCofins, BigDecimal vlCofinsImp, LocalDate dtPagCofins, String locExeServ) {
        this.vlTotServ = vlTotServ;
        this.vlBcPis = vlBcPis;
        this.vlPisImp = vlPisImp;
        this.dtPagPis = dtPagPis;
        this.vlBcCofins = vlBcCofins;
        this.vlCofinsImp = vlCofinsImp;
        this.dtPagCofins = dtPagCofins;
        this.locExeServ = locExeServ;
    }

    public RegA120(){ }
}

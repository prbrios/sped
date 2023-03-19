package efd.contribuicoes.blocoA.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegA120 implements Serializable {
	private static final long serialVersionUID = 3615341528498941131L;

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

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlTotServ() {
        return vlTotServ;
    }

    public void setVlTotServ(BigDecimal vlTotServ) {
        this.vlTotServ = vlTotServ;
    }

    public BigDecimal getVlBcPis() {
        return vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }

    public BigDecimal getVlPisImp() {
        return vlPisImp;
    }

    public void setVlPisImp(BigDecimal vlPisImp) {
        this.vlPisImp = vlPisImp;
    }

    public LocalDate getDtPagPis() {
        return dtPagPis;
    }

    public void setDtPagPis(LocalDate dtPagPis) {
        this.dtPagPis = dtPagPis;
    }

    public BigDecimal getVlBcCofins() {
        return vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }

    public BigDecimal getVlCofinsImp() {
        return vlCofinsImp;
    }

    public void setVlCofinsImp(BigDecimal vlCofinsImp) {
        this.vlCofinsImp = vlCofinsImp;
    }

    public LocalDate getDtPagCofins() {
        return dtPagCofins;
    }

    public void setDtPagCofins(LocalDate dtPagCofins) {
        this.dtPagCofins = dtPagCofins;
    }

    public String getLocExeServ() {
        return locExeServ;
    }

    public void setLocExeServ(String locExeServ) {
        this.locExeServ = locExeServ;
    }
    
}

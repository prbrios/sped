package efd.contribuicoes.blocoP.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoP.n1.n2.n3.RegP210;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegP200 implements Serializable {
	private static final long serialVersionUID = -1479123505846584856L;

	@Inclui
	private final String reg = "P200";

    @Inclui(formatoData = "MMyyyy")
    private LocalDate perRef;

    @Inclui
    private BigDecimal vlTotContApu;

    @Inclui
    private BigDecimal vlTotAjAcres;

    @Inclui
    private BigDecimal vlTotContDev;

    @Inclui
    private String codRec;

    @Filho
    private List<RegP210> regP210;

    public RegP200(LocalDate perRef, BigDecimal vlTotContApu, BigDecimal vlTotAjAcres, BigDecimal vlTotContDev, String codRec) {
        this.perRef = perRef;
        this.vlTotContApu = vlTotContApu;
        this.vlTotAjAcres = vlTotAjAcres;
        this.vlTotContDev = vlTotContDev;
        this.codRec = codRec;
    }

    public RegP200(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getPerRef() {
        return perRef;
    }

    public void setPerRef(LocalDate perRef) {
        this.perRef = perRef;
    }

    public BigDecimal getVlTotContApu() {
        return vlTotContApu;
    }

    public void setVlTotContApu(BigDecimal vlTotContApu) {
        this.vlTotContApu = vlTotContApu;
    }

    public BigDecimal getVlTotAjAcres() {
        return vlTotAjAcres;
    }

    public void setVlTotAjAcres(BigDecimal vlTotAjAcres) {
        this.vlTotAjAcres = vlTotAjAcres;
    }

    public BigDecimal getVlTotContDev() {
        return vlTotContDev;
    }

    public void setVlTotContDev(BigDecimal vlTotContDev) {
        this.vlTotContDev = vlTotContDev;
    }

    public String getCodRec() {
        return codRec;
    }

    public void setCodRec(String codRec) {
        this.codRec = codRec;
    }

    public List<RegP210> getRegP210() {
        return regP210;
    }

    public void setRegP210(List<RegP210> regP210) {
        this.regP210 = regP210;
    }
    
}

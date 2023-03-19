package efd.icmsipi.blocoG.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegG126 implements Serializable {
	private static final long serialVersionUID = 4561528865969522724L;

	@Inclui
    private final String reg = "G126";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Inclui
    private Integer numParc;

    @Inclui
    private BigDecimal vlParcPass;

    @Inclui
    private BigDecimal clTribOc;

    @Inclui
    private BigDecimal vlTotal;

    @Inclui
    private BigDecimal indPerSai;

    @Inclui
    private BigDecimal vlParcAprop;

    public RegG126(LocalDate dtIni, LocalDate dtFin, Integer numParc, BigDecimal vlParcPass, BigDecimal clTribOc, BigDecimal vlTotal, BigDecimal indPerSai, BigDecimal vlParcAprop) {
        this.dtIni = dtIni;
        this.dtFin = dtFin;
        this.numParc = numParc;
        this.vlParcPass = vlParcPass;
        this.clTribOc = clTribOc;
        this.vlTotal = vlTotal;
        this.indPerSai = indPerSai;
        this.vlParcAprop = vlParcAprop;
    }

    public RegG126(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtIni() {
        return dtIni;
    }

    public void setDtIni(LocalDate dtIni) {
        this.dtIni = dtIni;
    }

    public LocalDate getDtFin() {
        return dtFin;
    }

    public void setDtFin(LocalDate dtFin) {
        this.dtFin = dtFin;
    }

    public Integer getNumParc() {
        return numParc;
    }

    public void setNumParc(Integer numParc) {
        this.numParc = numParc;
    }

    public BigDecimal getVlParcPass() {
        return vlParcPass;
    }

    public void setVlParcPass(BigDecimal vlParcPass) {
        this.vlParcPass = vlParcPass;
    }

    public BigDecimal getClTribOc() {
        return clTribOc;
    }

    public void setClTribOc(BigDecimal clTribOc) {
        this.clTribOc = clTribOc;
    }

    public BigDecimal getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(BigDecimal vlTotal) {
        this.vlTotal = vlTotal;
    }

    public BigDecimal getIndPerSai() {
        return indPerSai;
    }

    public void setIndPerSai(BigDecimal indPerSai) {
        this.indPerSai = indPerSai;
    }

    public BigDecimal getVlParcAprop() {
        return vlParcAprop;
    }

    public void setVlParcAprop(BigDecimal vlParcAprop) {
        this.vlParcAprop = vlParcAprop;
    }
    
}
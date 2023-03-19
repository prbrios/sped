package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD360;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD365;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD390;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegD355 implements Serializable {
	private static final long serialVersionUID = 7752971785872730982L;

	@Inclui
    private final String reg = "D355";

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private Integer cro;

    @Inclui
    private Integer crz;

    @Inclui
    private Integer numCooFin;

    @Inclui
    private Integer gtFin;

    @Inclui
    private BigDecimal vlBrt;

    @Filho
    private RegD360 regD360;

    @Filho
    private List<RegD365> regD365;

    @Filho
    private List<RegD390> regD390;

    public RegD355(LocalDate dtDoc, Integer cro, Integer crz, Integer numCooFin, Integer gtFin, BigDecimal vlBrt) {
        this.dtDoc = dtDoc;
        this.cro = cro;
        this.crz = crz;
        this.numCooFin = numCooFin;
        this.gtFin = gtFin;
        this.vlBrt = vlBrt;
    }

    public RegD355(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }

    public Integer getCro() {
        return cro;
    }

    public void setCro(Integer cro) {
        this.cro = cro;
    }

    public Integer getCrz() {
        return crz;
    }

    public void setCrz(Integer crz) {
        this.crz = crz;
    }

    public Integer getNumCooFin() {
        return numCooFin;
    }

    public void setNumCooFin(Integer numCooFin) {
        this.numCooFin = numCooFin;
    }

    public Integer getGtFin() {
        return gtFin;
    }

    public void setGtFin(Integer gtFin) {
        this.gtFin = gtFin;
    }

    public BigDecimal getVlBrt() {
        return vlBrt;
    }

    public void setVlBrt(BigDecimal vlBrt) {
        this.vlBrt = vlBrt;
    }

    public RegD360 getRegD360() {
        return regD360;
    }

    public void setRegD360(RegD360 regD360) {
        this.regD360 = regD360;
    }

    public List<RegD365> getRegD365() {
        return regD365;
    }

    public void setRegD365(List<RegD365> regD365) {
        this.regD365 = regD365;
    }

    public List<RegD390> getRegD390() {
        return regD390;
    }

    public void setRegD390(List<RegD390> regD390) {
        this.regD390 = regD390;
    }
    
}
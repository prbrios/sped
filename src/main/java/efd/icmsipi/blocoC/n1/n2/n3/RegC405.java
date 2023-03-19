package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC405 implements Serializable {
	private static final long serialVersionUID = 1564885909909216790L;

	@Inclui
    private final String reg = "C405";

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private Integer cro;

    @Inclui
    private Integer crz;

    @Inclui
    private Integer numCooFin;

    @Inclui
    private BigDecimal gtFin;

    @Inclui
    private BigDecimal vlBrt;

    @Filho
    private RegC410 regC410;

    @Filho
    private List<RegC420> regC420;

    @Filho
    private List<RegC460> regC460;

    @Filho
    private List<RegC490> regC490;

    public RegC405(LocalDate dtDoc, Integer cro, Integer crz, Integer numCooFin, BigDecimal gtFin, BigDecimal vlBrt) {
        this.dtDoc = dtDoc;
        this.cro = cro;
        this.crz = crz;
        this.numCooFin = numCooFin;
        this.gtFin = gtFin;
        this.vlBrt = vlBrt;
    }

    public RegC405(){}

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

    public BigDecimal getGtFin() {
        return gtFin;
    }

    public void setGtFin(BigDecimal gtFin) {
        this.gtFin = gtFin;
    }

    public BigDecimal getVlBrt() {
        return vlBrt;
    }

    public void setVlBrt(BigDecimal vlBrt) {
        this.vlBrt = vlBrt;
    }

    public RegC410 getRegC410() {
        return regC410;
    }

    public void setRegC410(RegC410 regC410) {
        this.regC410 = regC410;
    }

    public List<RegC420> getRegC420() {
        return regC420;
    }

    public void setRegC420(List<RegC420> regC420) {
        this.regC420 = regC420;
    }

    public List<RegC460> getRegC460() {
        return regC460;
    }

    public void setRegC460(List<RegC460> regC460) {
        this.regC460 = regC460;
    }

    public List<RegC490> getRegC490() {
        return regC490;
    }

    public void setRegC490(List<RegC490> regC490) {
        this.regC490 = regC490;
    }
    
}
package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.n5.RegC481;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.n5.RegC485;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC405 implements Serializable {
	private static final long serialVersionUID = 4343343034082191359L;

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
    private List<RegC481> regC481;

    @Filho
    private List<RegC485> regC485;

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

    public List<RegC481> getRegC481() {
        return regC481;
    }

    public void setRegC481(List<RegC481> regC481) {
        this.regC481 = regC481;
    }

    public List<RegC485> getRegC485() {
        return regC485;
    }

    public void setRegC485(List<RegC485> regC485) {
        this.regC485 = regC485;
    }
    
}

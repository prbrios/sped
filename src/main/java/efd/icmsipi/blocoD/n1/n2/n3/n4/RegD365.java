package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.n5.RegD370;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegD365 implements Serializable {
	private static final long serialVersionUID = 7169799217756282229L;

	@Inclui
    private final String reg = "D365";

    @Inclui
    private String codTotPar;

    @Inclui
    private BigDecimal vlrAcumTot;

    @Inclui
    private Integer nrTot;

    @Inclui
    private String descrNrTot;

    @Filho
    private List<RegD370> regD370;

    public RegD365(String codTotPar, BigDecimal vlrAcumTot, Integer nrTot, String descrNrTot) {
        this.codTotPar = codTotPar;
        this.vlrAcumTot = vlrAcumTot;
        this.nrTot = nrTot;
        this.descrNrTot = descrNrTot;
    }

    public RegD365(){}

    public String getReg() {
        return reg;
    }

    public String getCodTotPar() {
        return codTotPar;
    }

    public void setCodTotPar(String codTotPar) {
        this.codTotPar = codTotPar;
    }

    public BigDecimal getVlrAcumTot() {
        return vlrAcumTot;
    }

    public void setVlrAcumTot(BigDecimal vlrAcumTot) {
        this.vlrAcumTot = vlrAcumTot;
    }

    public Integer getNrTot() {
        return nrTot;
    }

    public void setNrTot(Integer nrTot) {
        this.nrTot = nrTot;
    }

    public String getDescrNrTot() {
        return descrNrTot;
    }

    public void setDescrNrTot(String descrNrTot) {
        this.descrNrTot = descrNrTot;
    }

    public List<RegD370> getRegD370() {
        return regD370;
    }

    public void setRegD370(List<RegD370> regD370) {
        this.regD370 = regD370;
    }
    
}
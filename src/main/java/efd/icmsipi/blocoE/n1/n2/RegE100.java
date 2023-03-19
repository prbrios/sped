package efd.icmsipi.blocoE.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.RegE110;

import java.io.Serializable;
import java.time.LocalDate;

public class RegE100 implements Serializable {
	private static final long serialVersionUID = -4946803406778766232L;

	@Inclui
    private final String reg = "E100";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Filho
    private RegE110 regE110;

    public RegE100(LocalDate dtIni, LocalDate dtFin) {
        this.dtIni = dtIni;
        this.dtFin = dtFin;
    }

    public RegE100(){}

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

    public RegE110 getRegE110() {
        return regE110;
    }

    public void setRegE110(RegE110 regE110) {
        this.regE110 = regE110;
    }
    
}
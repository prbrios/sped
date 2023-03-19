package efd.icmsipi.blocoE.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.RegE310;

import java.io.Serializable;
import java.time.LocalDate;

public class RegE300 implements Serializable {
	private static final long serialVersionUID = 1194037608186673802L;

	@Inclui
    private final String reg = "E300";

    @Inclui
    private String uf;

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Filho
    private RegE310 regE310;

    public RegE300(String uf, LocalDate dtIni, LocalDate dtFin) {
        this.uf = uf;
        this.dtIni = dtIni;
        this.dtFin = dtFin;
    }

    public RegE300(){}

    public String getReg() {
        return reg;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
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

    public RegE310 getRegE310() {
        return regE310;
    }

    public void setRegE310(RegE310 regE310) {
        this.regE310 = regE310;
    }
    
}
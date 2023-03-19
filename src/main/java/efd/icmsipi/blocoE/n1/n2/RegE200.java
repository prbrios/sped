package efd.icmsipi.blocoE.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.RegE210;

import java.io.Serializable;
import java.time.LocalDate;

public class RegE200 implements Serializable {
	private static final long serialVersionUID = -4443745614116388056L;

	@Inclui
    private final String reg = "E200";

    @Inclui
    private String uf;

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Filho
    private RegE210 regE210;

    public RegE200(String uf, LocalDate dtIni, LocalDate dtFin) {
        this.uf = uf;
        this.dtIni = dtIni;
        this.dtFin = dtFin;
    }

    public RegE200(){}

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

    public RegE210 getRegE210() {
        return regE210;
    }

    public void setRegE210(RegE210 regE210) {
        this.regE210 = regE210;
    }
    
}

package efd.ecd.blocoK.n1.n2;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoK.n1.n2.n3.RegK100;

public class RegK030 implements Serializable {
	private static final long serialVersionUID = -941285032833914063L;

	@Inclui
    private final String reg = "K030";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Filho
    private List<RegK100> regK100;

    public RegK030(LocalDate dtIni, LocalDate dtFin) {
        this.dtIni = dtIni;
        this.dtFin = dtFin;
    }

    public RegK030() {}

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

    public List<RegK100> getRegK100() {
        return regK100;
    }

    public void setRegK100(List<RegK100> regK100) {
        this.regK100 = regK100;
    }
    

}

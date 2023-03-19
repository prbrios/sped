package efd.icmsipi.blocoE.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.RegE510;
import efd.icmsipi.blocoE.n1.n2.n3.RegE520;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class RegE500 implements Serializable {
	private static final long serialVersionUID = -4189231192322548632L;

	@Inclui
    private final String reg = "E500";

    @Inclui
    private String indApur;

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Filho
    private List<RegE510> regE510;

    @Filho
    private RegE520 regE520;

    public RegE500(String indApur, LocalDate dtIni, LocalDate dtFin) {
        this.indApur = indApur;
        this.dtIni = dtIni;
        this.dtFin = dtFin;
    }

    public RegE500(){}

    public String getReg() {
        return reg;
    }

    public String getIndApur() {
        return indApur;
    }

    public void setIndApur(String indApur) {
        this.indApur = indApur;
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

    public List<RegE510> getRegE510() {
        return regE510;
    }

    public void setRegE510(List<RegE510> regE510) {
        this.regE510 = regE510;
    }

    public RegE520 getRegE520() {
        return regE520;
    }

    public void setRegE520(RegE520 regE520) {
        this.regE520 = regE520;
    }
    
}
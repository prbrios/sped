package efd.ecd.blocoJ.n1.n2;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoJ.n1.n2.n3.RegJ100;
import efd.ecd.blocoJ.n1.n2.n3.RegJ150;
import efd.ecd.blocoJ.n1.n2.n3.RegJ210;
import efd.ecd.blocoJ.n1.n2.n3.RegJ800;
import efd.ecd.blocoJ.n1.n2.n3.RegJ801;

public class RegJ005 implements Serializable {
	private static final long serialVersionUID = 6517463535046071546L;

	@Inclui
    private final String reg = "J005";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Inclui
    private Integer idDem;

    @Inclui
    private String cabDem;

    @Filho
    private List<RegJ100> regJ100;

    @Filho
    private List<RegJ150> regJ150;

    @Filho
    private List<RegJ210> regJ210;

    @Filho
    private List<RegJ800> regJ800;

    @Filho
    private RegJ801 regJ801;

    public RegJ005(LocalDate dtIni, LocalDate dtFin, Integer idDem, String cabDem) {
        this.dtIni = dtIni;
        this.dtFin = dtFin;
        this.idDem = idDem;
        this.cabDem = cabDem;
    }

    public RegJ005() {}

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

    public Integer getIdDem() {
        return idDem;
    }

    public void setIdDem(Integer idDem) {
        this.idDem = idDem;
    }

    public String getCabDem() {
        return cabDem;
    }

    public void setCabDem(String cabDem) {
        this.cabDem = cabDem;
    }

    public List<RegJ100> getRegJ100() {
        return regJ100;
    }

    public void setRegJ100(List<RegJ100> regJ100) {
        this.regJ100 = regJ100;
    }

    public List<RegJ150> getRegJ150() {
        return regJ150;
    }

    public void setRegJ150(List<RegJ150> regJ150) {
        this.regJ150 = regJ150;
    }

    public List<RegJ210> getRegJ210() {
        return regJ210;
    }

    public void setRegJ210(List<RegJ210> regJ210) {
        this.regJ210 = regJ210;
    }

    public List<RegJ800> getRegJ800() {
        return regJ800;
    }

    public void setRegJ800(List<RegJ800> regJ800) {
        this.regJ800 = regJ800;
    }

    public RegJ801 getRegJ801() {
        return regJ801;
    }

    public void setRegJ801(RegJ801 regJ801) {
        this.regJ801 = regJ801;
    }
    

}

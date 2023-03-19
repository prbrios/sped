package efd.icmsipi.blocoD.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.RegD696;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class RegD695 implements Serializable {
	private static final long serialVersionUID = -1789591246036476752L;

	@Inclui
    private final String reg = "D695";

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer nroDocIni;

    @Inclui
    private Integer nroDocFin;

    @Inclui
    private LocalDate dtDocIni;

    @Inclui
    private LocalDate dtDocFin;

    @Inclui
    private String nomMest;

    @Inclui
    private String chvCodDig;

    @Filho
    private List<RegD696> regD696;

    public RegD695(String codMod, String ser, Integer nroDocIni, Integer nroDocFin, LocalDate dtDocIni, LocalDate dtDocFin, String nomMest, String chvCodDig) {
        this.codMod = codMod;
        this.ser = ser;
        this.nroDocIni = nroDocIni;
        this.nroDocFin = nroDocFin;
        this.dtDocIni = dtDocIni;
        this.dtDocFin = dtDocFin;
        this.nomMest = nomMest;
        this.chvCodDig = chvCodDig;
    }

    public RegD695(){}

    public String getReg() {
        return reg;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public Integer getNroDocIni() {
        return nroDocIni;
    }

    public void setNroDocIni(Integer nroDocIni) {
        this.nroDocIni = nroDocIni;
    }

    public Integer getNroDocFin() {
        return nroDocFin;
    }

    public void setNroDocFin(Integer nroDocFin) {
        this.nroDocFin = nroDocFin;
    }

    public LocalDate getDtDocIni() {
        return dtDocIni;
    }

    public void setDtDocIni(LocalDate dtDocIni) {
        this.dtDocIni = dtDocIni;
    }

    public LocalDate getDtDocFin() {
        return dtDocFin;
    }

    public void setDtDocFin(LocalDate dtDocFin) {
        this.dtDocFin = dtDocFin;
    }

    public String getNomMest() {
        return nomMest;
    }

    public void setNomMest(String nomMest) {
        this.nomMest = nomMest;
    }

    public String getChvCodDig() {
        return chvCodDig;
    }

    public void setChvCodDig(String chvCodDig) {
        this.chvCodDig = chvCodDig;
    }

    public List<RegD696> getRegD696() {
        return regD696;
    }

    public void setRegD696(List<RegD696> regD696) {
        this.regD696 = regD696;
    }
    
}
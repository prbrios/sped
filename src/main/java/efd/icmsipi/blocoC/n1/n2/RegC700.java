package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.RegC790;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class RegC700 implements Serializable {
	private static final long serialVersionUID = 7721617129417117267L;

	@Inclui
    private final String reg = "C700";

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer nroOrdIni;

    @Inclui
    private Integer nroOrdFin;

    @Inclui
    private LocalDate dtDocIni;

    @Inclui
    private LocalDate dtDocFin;

    @Inclui
    private String nomMest;

    @Inclui
    private String chvCodDig;

    @Filho
    private List<RegC790> regC790;

    public RegC700(String codMod, String ser, Integer nroOrdIni, Integer nroOrdFin, LocalDate dtDocIni, LocalDate dtDocFin, String nomMest, String chvCodDig) {
        this.codMod = codMod;
        this.ser = ser;
        this.nroOrdIni = nroOrdIni;
        this.nroOrdFin = nroOrdFin;
        this.dtDocIni = dtDocIni;
        this.dtDocFin = dtDocFin;
        this.nomMest = nomMest;
        this.chvCodDig = chvCodDig;
    }

    public RegC700(){}

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

    public Integer getNroOrdIni() {
        return nroOrdIni;
    }

    public void setNroOrdIni(Integer nroOrdIni) {
        this.nroOrdIni = nroOrdIni;
    }

    public Integer getNroOrdFin() {
        return nroOrdFin;
    }

    public void setNroOrdFin(Integer nroOrdFin) {
        this.nroOrdFin = nroOrdFin;
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

    public List<RegC790> getRegC790() {
        return regC790;
    }

    public void setRegC790(List<RegC790> regC790) {
        this.regC790 = regC790;
    }
    
}
package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.RegC870;
import efd.icmsipi.blocoC.n1.n2.n3.RegC890;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class RegC860 implements Serializable {
	private static final long serialVersionUID = 4102997785947095924L;

	@Inclui
    private final String reg = "C860";

    @Inclui
    private String codMod;

    @Inclui
    private Integer nrSat;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private Integer docIni;

    @Inclui
    private Integer docFin;

    @Filho
    private List<RegC870> regC870;

    @Filho
    private List<RegC890> regC890;

    public RegC860(String codMod, Integer nrSat, LocalDate dtDoc, Integer docIni, Integer docFin) {
        this.codMod = codMod;
        this.nrSat = nrSat;
        this.dtDoc = dtDoc;
        this.docIni = docIni;
        this.docFin = docFin;
    }

    public RegC860(){}

    public String getReg() {
        return reg;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public Integer getNrSat() {
        return nrSat;
    }

    public void setNrSat(Integer nrSat) {
        this.nrSat = nrSat;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }

    public Integer getDocIni() {
        return docIni;
    }

    public void setDocIni(Integer docIni) {
        this.docIni = docIni;
    }

    public Integer getDocFin() {
        return docFin;
    }

    public void setDocFin(Integer docFin) {
        this.docFin = docFin;
    }

    public List<RegC870> getRegC870() {
        return regC870;
    }

    public void setRegC870(List<RegC870> regC870) {
        this.regC870 = regC870;
    }

    public List<RegC890> getRegC890() {
        return regC890;
    }

    public void setRegC890(List<RegC890> regC890) {
        this.regC890 = regC890;
    }
    
}
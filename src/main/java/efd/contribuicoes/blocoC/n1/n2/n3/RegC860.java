package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC870;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC880;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC890;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class RegC860 implements Serializable {
	private static final long serialVersionUID = 8391901746773846054L;

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
    private Integer docFim;

    @Filho
    private List<RegC870> regC870;

    @Filho
    private List<RegC880> regC880;

    @Filho
    private List<RegC890> regC890;

    public RegC860(String codMod, Integer nrSat, LocalDate dtDoc, Integer docIni, Integer docFim) {
        this.codMod = codMod;
        this.nrSat = nrSat;
        this.dtDoc = dtDoc;
        this.docIni = docIni;
        this.docFim = docFim;
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

    public Integer getDocFim() {
        return docFim;
    }

    public void setDocFim(Integer docFim) {
        this.docFim = docFim;
    }

    public List<RegC870> getRegC870() {
        return regC870;
    }

    public void setRegC870(List<RegC870> regC870) {
        this.regC870 = regC870;
    }

    public List<RegC880> getRegC880() {
        return regC880;
    }

    public void setRegC880(List<RegC880> regC880) {
        this.regC880 = regC880;
    }

    public List<RegC890> getRegC890() {
        return regC890;
    }

    public void setRegC890(List<RegC890> regC890) {
        this.regC890 = regC890;
    }
    
}

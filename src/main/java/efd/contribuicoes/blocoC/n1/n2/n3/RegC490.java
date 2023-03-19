package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC491;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC495;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC499;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class RegC490 implements Serializable {
	private static final long serialVersionUID = 588611338041220300L;

	@Inclui
	private final String reg = "C490";

    @Inclui
    private LocalDate dtDocIni;

    @Inclui
    private LocalDate dtDocFin;

    @Inclui
    private String codMod;

    @Filho
    private List<RegC491> regC491;

    @Filho
    private List<RegC495> regC495;

    @Filho
    private List<RegC499> regC499;

    public RegC490(LocalDate dtDocIni, LocalDate dtDocFin, String codMod) {
        this.dtDocIni = dtDocIni;
        this.dtDocFin = dtDocFin;
        this.codMod = codMod;
    }

    public RegC490(){ }

    public String getReg() {
        return reg;
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

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public List<RegC491> getRegC491() {
        return regC491;
    }

    public void setRegC491(List<RegC491> regC491) {
        this.regC491 = regC491;
    }

    public List<RegC495> getRegC495() {
        return regC495;
    }

    public void setRegC495(List<RegC495> regC495) {
        this.regC495 = regC495;
    }

    public List<RegC499> getRegC499() {
        return regC499;
    }

    public void setRegC499(List<RegC499> regC499) {
        this.regC499 = regC499;
    }
    
}

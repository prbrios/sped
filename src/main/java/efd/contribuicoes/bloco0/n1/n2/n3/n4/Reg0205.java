package efd.contribuicoes.bloco0.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.time.LocalDate;

public class Reg0205 implements Serializable {
	private static final long serialVersionUID = -6101962636376470404L;

	@Inclui
	private final String reg = "0205";

    @Inclui
    private String descrAntItem;

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFim;

    @Inclui
    private String codAntItem;

    public Reg0205(String descrAntItem, LocalDate dtIni, LocalDate dtFim, String codAntItem) {
        this.descrAntItem = descrAntItem;
        this.dtIni = dtIni;
        this.dtFim = dtFim;
        this.codAntItem = codAntItem;
    }

    public Reg0205(){}

    public String getReg() {
        return reg;
    }

    public String getDescrAntItem() {
        return descrAntItem;
    }

    public void setDescrAntItem(String descrAntItem) {
        this.descrAntItem = descrAntItem;
    }

    public LocalDate getDtIni() {
        return dtIni;
    }

    public void setDtIni(LocalDate dtIni) {
        this.dtIni = dtIni;
    }

    public LocalDate getDtFim() {
        return dtFim;
    }

    public void setDtFim(LocalDate dtFim) {
        this.dtFim = dtFim;
    }

    public String getCodAntItem() {
        return codAntItem;
    }

    public void setCodAntItem(String codAntItem) {
        this.codAntItem = codAntItem;
    }
    
}

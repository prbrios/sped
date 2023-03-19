package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.time.LocalDate;

public class RegD530 implements Serializable {
	private static final long serialVersionUID = 5039995847073522913L;

	@Inclui
    private final String reg = "D530";

    @Inclui
    private String indServ;

    @Inclui
    private LocalDate dtIniServ;

    @Inclui
    private LocalDate dtFinServ;

    @Inclui
    private Integer perFiscal;

    @Inclui
    private String codArea;

    @Inclui
    private Integer terminal;

    public RegD530(String indServ, LocalDate dtIniServ, LocalDate dtFinServ, Integer perFiscal, String codArea, Integer terminal) {
        this.indServ = indServ;
        this.dtIniServ = dtIniServ;
        this.dtFinServ = dtFinServ;
        this.perFiscal = perFiscal;
        this.codArea = codArea;
        this.terminal = terminal;
    }

    public RegD530(){}

    public String getReg() {
        return reg;
    }

    public String getIndServ() {
        return indServ;
    }

    public void setIndServ(String indServ) {
        this.indServ = indServ;
    }

    public LocalDate getDtIniServ() {
        return dtIniServ;
    }

    public void setDtIniServ(LocalDate dtIniServ) {
        this.dtIniServ = dtIniServ;
    }

    public LocalDate getDtFinServ() {
        return dtFinServ;
    }

    public void setDtFinServ(LocalDate dtFinServ) {
        this.dtFinServ = dtFinServ;
    }

    public Integer getPerFiscal() {
        return perFiscal;
    }

    public void setPerFiscal(Integer perFiscal) {
        this.perFiscal = perFiscal;
    }

    public String getCodArea() {
        return codArea;
    }

    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }

    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }
    
}
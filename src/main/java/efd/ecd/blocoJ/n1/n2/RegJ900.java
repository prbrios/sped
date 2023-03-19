package efd.ecd.blocoJ.n1.n2;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoJ.n1.n2.n3.RegJ930;
import efd.ecd.blocoJ.n1.n2.n3.RegJ932;
import efd.ecd.blocoJ.n1.n2.n3.RegJ935;

public class RegJ900 implements Serializable {
	private static final long serialVersionUID = 8026807293122838917L;

	@Inclui
    private final String reg = "J900";

    @Inclui
    private String dnrcEncer;

    @Inclui
    private Integer numOrd;

    @Inclui
    private String natLivro;

    @Inclui
    private String nome;

    @Inclui
    private Integer qtdLin;

    @Inclui
    private LocalDate dtIniEscr;

    @Inclui
    private LocalDate dtFinEscr;

    @Filho
    private List<RegJ930> regJ930;

    @Filho
    private List<RegJ932> regJ932;

    @Filho
    private List<RegJ935> regJ935;

    public RegJ900(String dnrcEncer, Integer numOrd, String natLivro, String nome, Integer qtdLin, LocalDate dtIniEscr,
            LocalDate dtFinEscr) {
        this.dnrcEncer = dnrcEncer;
        this.numOrd = numOrd;
        this.natLivro = natLivro;
        this.nome = nome;
        this.qtdLin = qtdLin;
        this.dtIniEscr = dtIniEscr;
        this.dtFinEscr = dtFinEscr;
    }

    public RegJ900() {}

    public String getReg() {
        return reg;
    }

    public String getDnrcEncer() {
        return dnrcEncer;
    }

    public void setDnrcEncer(String dnrcEncer) {
        this.dnrcEncer = dnrcEncer;
    }

    public Integer getNumOrd() {
        return numOrd;
    }

    public void setNumOrd(Integer numOrd) {
        this.numOrd = numOrd;
    }

    public String getNatLivro() {
        return natLivro;
    }

    public void setNatLivro(String natLivro) {
        this.natLivro = natLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdLin() {
        return qtdLin;
    }

    public void setQtdLin(Integer qtdLin) {
        this.qtdLin = qtdLin;
    }

    public LocalDate getDtIniEscr() {
        return dtIniEscr;
    }

    public void setDtIniEscr(LocalDate dtIniEscr) {
        this.dtIniEscr = dtIniEscr;
    }

    public LocalDate getDtFinEscr() {
        return dtFinEscr;
    }

    public void setDtFinEscr(LocalDate dtFinEscr) {
        this.dtFinEscr = dtFinEscr;
    }

    public List<RegJ930> getRegJ930() {
        return regJ930;
    }

    public void setRegJ930(List<RegJ930> regJ930) {
        this.regJ930 = regJ930;
    }

    public List<RegJ932> getRegJ932() {
        return regJ932;
    }

    public void setRegJ932(List<RegJ932> regJ932) {
        this.regJ932 = regJ932;
    }

    public List<RegJ935> getRegJ935() {
        return regJ935;
    }

    public void setRegJ935(List<RegJ935> regJ935) {
        this.regJ935 = regJ935;
    }
    

}

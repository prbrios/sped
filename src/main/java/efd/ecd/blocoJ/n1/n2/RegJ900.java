package efd.ecd.blocoJ.n1.n2;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoJ.n1.n2.n3.RegJ930;
import efd.ecd.blocoJ.n1.n2.n3.RegJ932;
import efd.ecd.blocoJ.n1.n2.n3.RegJ935;
import lombok.Getter;
import lombok.Setter;

public class RegJ900 implements Serializable {
	private static final long serialVersionUID = 8026807293122838917L;

	@Getter @Inclui
    private final String reg = "J900";

    @Getter @Setter @Inclui
    private String dnrcEncer;

    @Getter @Setter @Inclui
    private Integer numOrd;

    @Getter @Setter @Inclui
    private String natLivro;

    @Getter @Setter @Inclui
    private String nome;

    @Getter @Setter @Inclui
    private Integer qtdLin;

    @Getter @Setter @Inclui
    private LocalDate dtIniEscr;

    @Getter @Setter @Inclui
    private LocalDate dtFinEscr;

    @Getter @Setter @Filho
    private List<RegJ930> regJ930;

    @Getter @Setter @Filho
    private List<RegJ932> regJ932;

    @Getter @Setter @Filho
    private List<RegJ935> regJ935;

    public RegJ900() {}

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

}

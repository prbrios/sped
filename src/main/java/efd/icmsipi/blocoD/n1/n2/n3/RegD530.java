package efd.icmsipi.blocoD.n1.n2.n3;

import java.time.LocalDate;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegD530 {

    @Getter @Inclui
    private final String reg = "D530";

    @Getter @Setter @Inclui
    private String indServ;

    @Getter @Setter @Inclui
    private LocalDate dtIniServ;

    @Getter @Setter @Inclui
    private LocalDate dtFinServ;

    @Getter @Setter @Inclui
    private Integer perFiscal;

    @Getter @Setter @Inclui
    private String codArea;

    @Getter @Setter @Inclui
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
}
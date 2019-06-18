package efd.icmsipi.blocoK.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


public class RegK100 {

    @Getter @Inclui
    private final String reg = "K100";

    @Getter @Setter @Inclui
    private LocalDate dtIni;

    @Getter @Setter @Inclui
    private LocalDate dtFin;

    @Getter @Setter @Filho
    private List<RegK200> regK200;

    @Getter @Setter @Filho
    private List<RegK210> regK210;

    @Getter @Setter @Filho
    private List<RegK220> regK220;

    @Getter @Setter @Filho
    private List<RegK230> regK230;

    @Getter @Setter @Filho
    private List<RegK250> regK250;

    @Getter @Setter @Filho
    private List<RegK260> regK260;

    @Getter @Setter @Filho
    private List<RegK270> regK270;

    @Getter @Setter @Filho
    private List<RegK280> regK280;

    @Getter @Setter @Filho
    private List<RegK290> regK290;

    @Getter @Setter @Filho
    private List<RegK300> regK300;

    public RegK100(LocalDate dtIni, LocalDate dtFin) {
        this.dtIni = dtIni;
        this.dtFin = dtFin;
    }

    public RegK100(){}
}
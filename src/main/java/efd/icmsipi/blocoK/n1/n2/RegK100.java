package efd.icmsipi.blocoK.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegK100 {

    @Inclui
    private final String reg = "K100";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Filho
    private List<RegK200> regK200;

    @Filho
    private List<RegK210> regK210;

    @Filho
    private List<RegK220> regK220;

    @Filho
    private List<RegK230> regK230;

    @Filho
    private List<RegK250> regK250;

    @Filho
    private List<RegK260> regK260;

    @Filho
    private List<RegK270> regK270;

    @Filho
    private List<RegK280> regK280;

    @Filho
    private List<RegK290> regK290;

    @Filho
    private List<RegK300> regK300;

    public RegK100(LocalDate dtIni, LocalDate dtFin) {
        this.dtIni = dtIni;
        this.dtFin = dtFin;
    }

    public RegK100(){}
}
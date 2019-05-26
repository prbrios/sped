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
public class BlocoK100 {

    @Inclui
    private final String reg = "K100";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Filho
    private List<BlocoK200> blocoK200;

    @Filho
    private List<BlocoK210> blocoK210;

    @Filho
    private List<BlocoK220> blocoK220;

    @Filho
    private List<BlocoK230> blocoK230;

    @Filho
    private List<BlocoK250> blocoK250;

    @Filho
    private List<BlocoK260> blocoK260;

    @Filho
    private List<BlocoK270> blocoK270;

    @Filho
    private List<BlocoK280> blocoK280;

    @Filho
    private List<BlocoK290> blocoK290;

    @Filho
    private List<BlocoK300> blocoK300;

}
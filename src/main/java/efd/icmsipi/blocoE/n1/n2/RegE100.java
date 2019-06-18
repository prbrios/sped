package efd.icmsipi.blocoE.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.RegE110;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


public class RegE100 {

    @Getter @Inclui
    private final String reg = "E100";

    @Getter @Setter @Inclui
    private LocalDate dtIni;

    @Getter @Setter @Inclui
    private LocalDate dtFin;

    @Getter @Setter @Filho
    private RegE110 regE110;

    public RegE100(LocalDate dtIni, LocalDate dtFin) {
        this.dtIni = dtIni;
        this.dtFin = dtFin;
    }

    public RegE100(){}
}
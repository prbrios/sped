package efd.icmsipi.blocoE.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.RegE210;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


public class RegE200 {

    @Getter @Inclui
    private final String reg = "E200";

    @Getter @Setter @Inclui
    private String uf;

    @Getter @Setter @Inclui
    private LocalDate dtIni;

    @Getter @Setter @Inclui
    private LocalDate dtFin;

    @Getter @Setter @Filho
    private RegE210 regE210;

    public RegE200(String uf, LocalDate dtIni, LocalDate dtFin) {
        this.uf = uf;
        this.dtIni = dtIni;
        this.dtFin = dtFin;
    }

    public RegE200(){}
}

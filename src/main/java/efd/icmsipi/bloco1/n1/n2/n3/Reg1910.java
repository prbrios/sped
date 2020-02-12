package efd.icmsipi.bloco1.n1.n2.n3;

import java.time.LocalDate;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.n4.Reg1920;
import lombok.Getter;
import lombok.Setter;


public class Reg1910 {

    @Getter @Inclui
    private final String reg = "1910";

    @Getter @Setter @Inclui
    private LocalDate dtIni;

    @Getter @Setter @Inclui
    private LocalDate dtFin;

    @Getter @Setter @Filho
    private Reg1920 reg1920;

    public Reg1910(LocalDate dtIni, LocalDate dtFin) {
        this.dtIni = dtIni;
        this.dtFin = dtFin;
    }

    public Reg1910(){}
}
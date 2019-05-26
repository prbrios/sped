package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.n4.Reg1920;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Reg1910 {

    @Inclui
    private final String reg = "1910";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Filho
    private Reg1920 reg1920;

}
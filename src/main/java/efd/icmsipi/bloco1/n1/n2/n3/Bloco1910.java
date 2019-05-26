package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Bloco1910 {

    @Inclui
    private final String reg = "1910";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

}
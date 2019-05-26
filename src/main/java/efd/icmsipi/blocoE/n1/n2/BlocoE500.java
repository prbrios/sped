package efd.icmsipi.blocoE.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BlocoE500 {

    @Inclui
    private final String reg = "E500";

    @Inclui
    private String indApur;

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

}
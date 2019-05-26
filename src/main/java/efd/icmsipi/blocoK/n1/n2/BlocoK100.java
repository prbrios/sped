package efd.icmsipi.blocoK.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BlocoK100 {

    @Inclui
    private final String reg = "K100";

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

}
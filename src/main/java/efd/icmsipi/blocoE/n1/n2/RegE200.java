package efd.icmsipi.blocoE.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.RegE210;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class RegE200 {

    @Inclui
    private final String reg = "E200";

    @Inclui
    private String uf;

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Filho
    private RegE210 regE210;
}

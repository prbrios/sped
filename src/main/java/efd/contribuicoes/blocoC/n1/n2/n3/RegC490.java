package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class RegC490 {

    @Inclui
    private final String reg = "C490";

    @Inclui
    private LocalDate dtDocIni;

    @Inclui
    private LocalDate dtDocFin;

    @Inclui
    private String codMod;

}

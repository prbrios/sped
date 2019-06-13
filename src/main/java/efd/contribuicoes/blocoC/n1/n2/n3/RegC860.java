package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class RegC860 {

    @Inclui
    private final String reg = "C860";

    @Inclui
    private String codMod;

    @Inclui
    private Integer nrSat;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private Integer docIni;

    @Inclui
    private Integer docFim;

}

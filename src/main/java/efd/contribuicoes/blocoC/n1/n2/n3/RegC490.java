package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class RegC490 {

    @Getter @Inclui
    private final String reg = "C490";

    @Getter @Inclui
    private LocalDate dtDocIni;

    @Getter @Inclui
    private LocalDate dtDocFin;

    @Getter @Inclui
    private String codMod;

    public RegC490(LocalDate dtDocIni, LocalDate dtDocFin, String codMod) {
        this.dtDocIni = dtDocIni;
        this.dtDocFin = dtDocFin;
        this.codMod = codMod;
    }

    public RegC490(){ }
}

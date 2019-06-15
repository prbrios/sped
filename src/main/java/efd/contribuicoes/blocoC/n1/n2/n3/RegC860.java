package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class RegC860 {

    @Getter @Inclui
    private final String reg = "C860";

    @Getter @Inclui
    private String codMod;

    @Getter @Inclui
    private Integer nrSat;

    @Getter @Inclui
    private LocalDate dtDoc;

    @Getter @Inclui
    private Integer docIni;

    @Getter @Inclui
    private Integer docFim;

    public RegC860(String codMod, Integer nrSat, LocalDate dtDoc, Integer docIni, Integer docFim) {
        this.codMod = codMod;
        this.nrSat = nrSat;
        this.dtDoc = dtDoc;
        this.docIni = docIni;
        this.docFim = docFim;
    }

    public RegC860(){}
}

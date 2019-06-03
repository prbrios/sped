package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.RegC890;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

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
    private Integer docFin;

    @Filho
    private List<RegC890> regC890;

    public RegC860(String codMod, Integer nrSat, LocalDate dtDoc, Integer docIni, Integer docFin) {
        this.codMod = codMod;
        this.nrSat = nrSat;
        this.dtDoc = dtDoc;
        this.docIni = docIni;
        this.docFin = docFin;
    }

    public RegC860(){}
}
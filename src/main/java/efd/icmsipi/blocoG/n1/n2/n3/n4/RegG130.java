package efd.icmsipi.blocoG.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.n3.n4.n5.RegG140;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegG130 {

    @Inclui
    private final String reg = "G130";

    @Inclui
    private String indEmit;

    @Inclui
    private String codPart;

    @Inclui
    private String codMod;

    @Inclui
    private String serie;

    @Inclui
    private Integer numDoc;

    @Inclui
    private String chvNfeCte;

    @Inclui
    private LocalDate dtDoc;

    @Filho
    private List<RegG140> regG140;

    public RegG130(String indEmit, String codPart, String codMod, String serie, Integer numDoc, String chvNfeCte, LocalDate dtDoc) {
        this.indEmit = indEmit;
        this.codPart = codPart;
        this.codMod = codMod;
        this.serie = serie;
        this.numDoc = numDoc;
        this.chvNfeCte = chvNfeCte;
        this.dtDoc = dtDoc;
    }

    public RegG130(){}
}
package efd.icmsipi.blocoG.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.n3.n4.n5.RegG140;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


public class RegG130 {

    @Getter @Inclui
    private final String reg = "G130";

    @Getter @Setter @Inclui
    private String indEmit;

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private String serie;

    @Getter @Setter @Inclui
    private Integer numDoc;

    @Getter @Setter @Inclui
    private String chvNfeCte;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Filho
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
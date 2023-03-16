package efd.icmsipi.blocoG.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.n3.n4.n5.RegG140;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


public class RegG130 implements Serializable {
	private static final long serialVersionUID = 744845467171861085L;

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
    private Long numDoc;

    @Getter @Setter @Inclui
    private String chvNfeCte;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private String numDa;

    @Getter @Setter @Filho
    private List<RegG140> regG140;

    public RegG130(String indEmit, String codPart, String codMod, String serie, Long numDoc, String chvNfeCte, LocalDate dtDoc) {
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
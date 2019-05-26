package efd.icmsipi.blocoG.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.n3.n4.n5.BlocoG140;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoG130 {

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
    private List<BlocoG140> blocoG140;

}
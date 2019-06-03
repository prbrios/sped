package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class RegC114 {

    @Inclui
    private final String reg = "C114";

    @Inclui
    private String codMod;

    @Inclui
    private String ecfFab;

    @Inclui
    private Integer ecfCx;

    @Inclui
    private Integer numDoc;

    @Inclui
    private LocalDate dtDoc;

    public RegC114(String codMod, String ecfFab, Integer ecfCx, Integer numDoc, LocalDate dtDoc) {
        this.codMod = codMod;
        this.ecfFab = ecfFab;
        this.ecfCx = ecfCx;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
    }

    public RegC114(){}
}

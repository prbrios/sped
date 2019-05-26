package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class BlocoC116 {

    @Inclui
    private final String reg = "C116";

    @Inclui
    private String codMod;

    @Inclui
    private Long nrSat;

    @Inclui
    private String chvNfe;

    @Inclui
    private Integer numCfe;

    @Inclui
    private LocalDate dtDoc;

}

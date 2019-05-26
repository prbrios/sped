package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BlocoC114 {

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

}

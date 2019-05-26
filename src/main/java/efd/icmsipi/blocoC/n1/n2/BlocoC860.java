package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.BlocoC310;
import efd.icmsipi.blocoC.n1.n2.n3.BlocoC890;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoC860 {

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
    private List<BlocoC890> blocoC890;

}
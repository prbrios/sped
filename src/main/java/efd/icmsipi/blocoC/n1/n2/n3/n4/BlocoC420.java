package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.n5.BlocoC425;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class BlocoC420 {

    @Inclui
    private final String reg = "C420";

    @Inclui
    private String codTotPar;

    @Inclui
    private BigDecimal vlrAcumTot;

    @Inclui
    private Integer nrTot;

    @Inclui
    private String descrNrTot;

    @Filho
    private List<BlocoC425> blocoC425;

}
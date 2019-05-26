package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.BlocoD360;
import efd.icmsipi.blocoD.n1.n2.n3.n4.BlocoD365;
import efd.icmsipi.blocoD.n1.n2.n3.n4.BlocoD390;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoD355 {

    @Inclui
    private final String reg = "D355";

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private Integer cro;

    @Inclui
    private Integer crz;

    @Inclui
    private Integer numCooFin;

    @Inclui
    private Integer gtFin;

    @Inclui
    private BigDecimal vlBrt;

    @Filho
    private BlocoD360 blocoD360;

    @Filho
    private List<BlocoD365> blocoD365;

    @Filho
    private List<BlocoD390> blocoD390;

}
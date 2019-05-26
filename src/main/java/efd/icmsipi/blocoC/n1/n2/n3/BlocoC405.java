package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoC405 {

    @Inclui
    private final String reg = "C405";

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private Integer cro;

    @Inclui
    private Integer crz;

    @Inclui
    private Integer numCooFin;

    @Inclui
    private BigDecimal gtFin;

    @Inclui
    private BigDecimal vlBrt;

    @Filho
    private BlocoC410 blocoC410;

    @Filho
    private List<BlocoC420> blocoC420;

    @Filho
    private List<BlocoC460> blocoC460;

    @Filho
    private List<BlocoC490> blocoC490;

}
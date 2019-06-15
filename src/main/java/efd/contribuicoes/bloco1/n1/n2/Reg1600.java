package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Reg1600 {

    @Inclui
    private final String reg = "1600";

    @Inclui(formatoData = "MMyyyy")
    private LocalDate perApurAnt;

    @Inclui
    private String natContRec;

    @Inclui
    private BigDecimal vlContApur;

    @Inclui
    private BigDecimal vlCredCofinsDesc;

    @Inclui
    private BigDecimal vlContDev;

    @Inclui
    private BigDecimal vlOutDed;

    @Inclui
    private BigDecimal vlContExt;

    @Inclui
    private BigDecimal vlMul;

    @Inclui
    private BigDecimal vlJur;

    @Inclui
    private LocalDate dtRecol;

}

package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegM300 {

    @Inclui
    private final String reg = "M300";

    @Inclui
    private String codCont;

    @Inclui
    private BigDecimal vlContAputDifer;

    @Inclui
    private String natCredDesc;

    @Inclui
    private BigDecimal vlCredDescDifer;

    @Inclui
    private BigDecimal vlContDiferAnt;

    @Inclui(formatoData = "MMyyyy")
    private LocalDate perApur;

    @Inclui
    private LocalDate dtReceb;

}

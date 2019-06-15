package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Reg1800 {

    @Inclui
    private final String reg = "1800";

    @Inclui
    private String incImob;

    @Inclui
    private BigDecimal recRecebRet;

    @Inclui
    private BigDecimal recFinRet;

    @Inclui
    private BigDecimal bcRet;

    @Inclui
    private BigDecimal aliqRet;

    @Inclui
    private BigDecimal vlRecUni;

    @Inclui
    private LocalDate dtRecUni;

    @Inclui
    private String codRec;

}

package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegC112 {

    @Inclui
    private final String reg = "C112";

    @Inclui
    private String codDa;

    @Inclui
    private String uf;

    @Inclui
    private String numDa;

    @Inclui
    private String codAut;

    @Inclui
    private BigDecimal vlDa;

    @Inclui
    private LocalDate dtVcto;

    @Inclui
    private LocalDate dtPgto;

}

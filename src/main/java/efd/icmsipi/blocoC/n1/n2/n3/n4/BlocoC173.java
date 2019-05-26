package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
public class BlocoC173 {

    @Inclui
    private final String reg = "C173";

    @Inclui
    private String loteMed;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtdItem;

    @Inclui
    private LocalDate dtFab;

    @Inclui
    private LocalDate dtVal;

    @Inclui
    private String indMed;

    @Inclui
    private String tpProd;

    @Inclui
    private BigDecimal vlTabMax;

}

package efd.icmsipi.blocoH.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegH020 {

    @Inclui
    private final String reg = "H020";

    @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Inclui
    private BigDecimal bcIcms;

    @Inclui
    private BigDecimal vlIcms;

}
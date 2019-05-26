package efd.icmsipi.blocoH.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class BlocoH005 {

    @Inclui
    private final String reg = "H005";

    @Inclui
    private LocalDate dtInv;

    @Inclui
    private BigDecimal vlInv;

    @Inclui
    private String motInv;

}
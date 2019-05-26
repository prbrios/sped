package efd.icmsipi.blocoH.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegH990 {

    @Inclui
    private final String reg = "H990";

    @Inclui
    private Integer qtdLinH;

}
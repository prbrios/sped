package efd.icmsipi.blocoG.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class BlocoG001 {

    @Inclui
    private final String reg = "G001";

    @Inclui
    private String indMov;

}
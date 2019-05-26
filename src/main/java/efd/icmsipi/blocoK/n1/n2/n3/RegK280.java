package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegK280 {

    @Inclui
    private final String reg = "K280";

    @Inclui
    private LocalDate dtEst;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtdCorPos;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtdCodNeg;

    @Inclui
    private String indEst;

    @Inclui
    private String codPart;

}
package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class BlocoK270 {

    @Inclui
    private final String reg = "K270";

    @Inclui
    private LocalDate dtIniAp;

    @Inclui
    private LocalDate dtFinAp;

    @Inclui
    private String codOpOs;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdCorPos;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdCorNeg;

    @Inclui
    private String origem;

}
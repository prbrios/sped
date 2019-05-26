package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class BlocoK260 {

    @Inclui
    private final String reg = "K260";

    @Inclui
    private String codOpOs;

    @Inclui
    private String codItem;

    @Inclui
    private LocalDate dtSaida;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdSaida;

    @Inclui
    private LocalDate dtRet;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdRet;
}
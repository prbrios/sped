package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class BlocoK210 {

    @Inclui
    private final String reg = "K210";

    @Inclui
    private LocalDate dtIniOs;

    @Inclui
    private LocalDate dtFinOs;

    @Inclui
    private String codDocOs;

    @Inclui
    private String codItemOri;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdOri;

}
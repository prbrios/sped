package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class BlocoK220 {

    @Inclui
    private final String reg = "K220";

    @Inclui
    private LocalDate dtMov;

    @Inclui
    private String codItemOri;

    @Inclui
    private String codItemDeSt;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdOri;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdDest;

}
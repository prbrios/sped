package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegM605 {

    @Inclui
    private final String reg = "M605";

    @Inclui
    private String numCampo;

    @Inclui
    private String codRec;

    @Inclui
    private BigDecimal vlDebito;

}

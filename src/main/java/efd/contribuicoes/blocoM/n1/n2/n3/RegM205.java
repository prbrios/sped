package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegM205 {

    @Inclui
    private final String reg = "M205";

    @Inclui
    private String numCampo;

    @Inclui
    private String codRec;

    @Inclui
    private BigDecimal vlDebito;

}

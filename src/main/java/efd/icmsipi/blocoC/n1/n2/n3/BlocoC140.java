package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class BlocoC140 {

    @Inclui
    private final String reg = "C140";

    @Inclui
    private String indEmit;

    @Inclui
    private String indTit;

    @Inclui
    private String descTit;

    @Inclui
    private String numTit;

    @Inclui
    private Integer qtdParc;

    @Inclui
    private BigDecimal vlTit;

}

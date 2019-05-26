package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.BlocoC141;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

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

    @Filho
    private List<BlocoC141> blocoC141;

}

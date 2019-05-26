package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegB460 {

    @Inclui
    private final String reg = "B460";

    @Inclui
    private String indDed;

    @Inclui
    private BigDecimal vlDed;

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    @Inclui
    private String proc;

    @Inclui
    private String codInfObs;

    @Inclui
    private String indObr;

}

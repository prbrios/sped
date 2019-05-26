package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Reg1210 {

    @Inclui
    private final String reg = "1210";

    @Inclui
    private String tipoUtil;

    @Inclui
    private String nrDoc;

    @Inclui
    private BigDecimal vlCredUtil;

    @Inclui
    private String chvDoce;

}
package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BlocoD110 {

    @Inclui
    private final String reg = "D110";

    @Inclui
    private Integer numItem;

    @Inclui
    private String codItem;

    @Inclui
    private BigDecimal vlServ;

    @Inclui
    private BigDecimal vlOut;

}
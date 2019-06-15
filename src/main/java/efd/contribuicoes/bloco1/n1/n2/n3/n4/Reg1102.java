package efd.contribuicoes.bloco1.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Reg1102 {

    @Inclui
    private final String reg = "1102";

    @Inclui
    private BigDecimal vlCredPisTribMi;

    @Inclui
    private BigDecimal vlCredPisNtMi;

    @Inclui
    private BigDecimal vlCredPisExp;

}

package efd.contribuicoes.bloco1.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Reg1502 {

    @Inclui
    private final String reg = "1502";

    @Inclui
    private BigDecimal vlCredCofinsTribMi;

    @Inclui
    private BigDecimal vlCredCofinsNtMi;

    @Inclui
    private BigDecimal vlCredCofinsExp;

}

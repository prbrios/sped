package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegM230 {

    @Inclui
    private final String reg = "M230";

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private BigDecimal vlVend;

    @Inclui
    private BigDecimal vlNaoReceb;

    @Inclui
    private BigDecimal vlContDif;

    @Inclui
    private BigDecimal vlCredDif;

    @Inclui
    private String codCred;

}

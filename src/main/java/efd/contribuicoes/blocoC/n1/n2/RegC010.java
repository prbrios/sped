package efd.contribuicoes.blocoC.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegC010 {

    @Inclui
    private final String reg = "C010";

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private String indEscri;

}

package efd.contribuicoes.blocoF.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegF010 {

    @Inclui
    private final String reg = "F010";

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

}

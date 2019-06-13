package efd.contribuicoes.blocoA.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegA010 {

    @Inclui
    private final String reg = "A010";

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

}

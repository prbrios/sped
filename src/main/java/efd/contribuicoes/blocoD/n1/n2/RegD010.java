package efd.contribuicoes.blocoD.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegD010 {

    @Inclui
    private final String reg = "D010";

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;
}

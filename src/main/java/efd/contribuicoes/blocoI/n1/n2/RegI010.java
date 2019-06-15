package efd.contribuicoes.blocoI.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegI010 {

    @Inclui
    private final String reg = "I010";

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui(zerosEsquerda = 2)
    private Integer indAtiv;

    @Inclui
    private String infoCompl;

}

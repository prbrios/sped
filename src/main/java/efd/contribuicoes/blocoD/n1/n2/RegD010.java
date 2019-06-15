package efd.contribuicoes.blocoD.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegD010 {

    @Getter @Inclui
    private final String reg = "D010";

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    public RegD010(Long cnpj) {
        this.cnpj = cnpj;
    }

    public RegD010(){}
}

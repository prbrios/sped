package efd.contribuicoes.blocoA.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegA010 {

    @Getter @Inclui
    private final String reg = "A010";

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    public RegA010(Long cnpj) {
        this.cnpj = cnpj;
    }

    public RegA010(){ }
}

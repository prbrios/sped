package efd.contribuicoes.blocoF.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegF010 {

    @Getter @Inclui
    private final String reg = "F010";

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    public RegF010(Long cnpj) {
        this.cnpj = cnpj;
    }

    public RegF010(){ }
}

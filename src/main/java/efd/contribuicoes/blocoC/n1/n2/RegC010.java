package efd.contribuicoes.blocoC.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegC010 {

    @Getter @Inclui
    private final String reg = "C010";

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Inclui
    private String indEscri;

    public RegC010(Long cnpj, String indEscri) {
        this.cnpj = cnpj;
        this.indEscri = indEscri;
    }

    public RegC010(){ }
}

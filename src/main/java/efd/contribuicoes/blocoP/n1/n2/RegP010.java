package efd.contribuicoes.blocoP.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegP010 {

    @Getter @Inclui
    private final String reg = "P010";

    @Getter @Inclui
    private Long cnpj;

    public RegP010(Long cnpj) {
        this.cnpj = cnpj;
    }

    public RegP010(){}
}

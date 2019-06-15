package efd.contribuicoes.blocoI.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI010 {

    @Getter @Inclui
    private final String reg = "I010";

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer indAtiv;

    @Getter @Inclui
    private String infoCompl;

    public RegI010(Long cnpj, Integer indAtiv, String infoCompl) {
        this.cnpj = cnpj;
        this.indAtiv = indAtiv;
        this.infoCompl = infoCompl;
    }

    public RegI010(){}
}

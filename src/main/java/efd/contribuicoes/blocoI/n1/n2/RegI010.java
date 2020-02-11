package efd.contribuicoes.blocoI.n1.n2;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoI.n1.n2.n3.RegI100;
import lombok.Getter;
import lombok.Setter;

public class RegI010 {

    @Getter @Inclui
private final String reg = "I010";

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer indAtiv;

    @Getter @Setter @Inclui
    private String infoCompl;

    @Getter @Setter @Filho
    private List<RegI100> regI100;

    public RegI010(Long cnpj, Integer indAtiv, String infoCompl) {
        this.cnpj = cnpj;
        this.indAtiv = indAtiv;
        this.infoCompl = infoCompl;
    }

    public RegI010(){}
}

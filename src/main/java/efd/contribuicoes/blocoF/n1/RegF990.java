package efd.contribuicoes.blocoF.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegF990 {

    @Getter @Inclui
    private final String reg = "F990";

    @Getter @Inclui
    private Integer qtdLinF;

    public RegF990(Integer qtdLinF) {
        this.qtdLinF = qtdLinF;
    }

    public RegF990(){}
}

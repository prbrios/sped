package efd.contribuicoes.blocoA.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegA990 {

    @Getter @Inclui
private final String reg = "A990";

    @Getter @Setter @Inclui
    private Integer qtdLinA;

    public RegA990(Integer qtdLinA) {
        this.qtdLinA = qtdLinA;
    }

    public RegA990(){ }
}

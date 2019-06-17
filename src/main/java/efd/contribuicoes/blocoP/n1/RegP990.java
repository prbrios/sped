package efd.contribuicoes.blocoP.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegP990 {

    @Getter @Inclui
private final String reg = "P990";

    @Getter @Setter @Inclui
    private Integer qtdLinP;

    public RegP990(Integer qtdLinP) {
        this.qtdLinP = qtdLinP;
    }

    public RegP990(){}
}

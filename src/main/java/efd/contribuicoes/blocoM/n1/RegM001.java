package efd.contribuicoes.blocoM.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegM001 {

    @Getter @Inclui
    private final String reg = "M001";

    @Getter @Inclui
    private String indMov;

    public RegM001(String indMov) {
        this.indMov = indMov;
    }

    public RegM001(){}
}

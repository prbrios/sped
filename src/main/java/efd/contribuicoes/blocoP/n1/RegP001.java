package efd.contribuicoes.blocoP.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegP001 {

    @Getter @Inclui
    private final String reg = "P001";

    @Getter @Inclui
    private String indMov;

    public RegP001(String indMov) {
        this.indMov = indMov;
    }

    public RegP001(){}
}

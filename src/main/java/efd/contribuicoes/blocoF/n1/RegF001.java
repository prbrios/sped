package efd.contribuicoes.blocoF.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegF001 {

    @Getter @Inclui
    private final String reg = "F001";

    @Getter @Inclui
    private String indMov;

    public RegF001(String indMov) {
        this.indMov = indMov;
    }

    public RegF001(){ }
}

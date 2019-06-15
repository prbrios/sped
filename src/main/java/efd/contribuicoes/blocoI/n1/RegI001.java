package efd.contribuicoes.blocoI.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI001 {

    @Getter @Inclui
    private final String reg = "I001";

    @Getter @Inclui
    private String indMov;

    public RegI001(String indMov) {
        this.indMov = indMov;
    }

    public RegI001(){}
}

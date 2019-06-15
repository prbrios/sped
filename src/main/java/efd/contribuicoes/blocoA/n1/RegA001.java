package efd.contribuicoes.blocoA.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegA001 {

    @Getter @Inclui
    private final String reg = "A001";

    @Getter @Inclui
    private String indMov;

    public RegA001(String indMov) {
        this.indMov = indMov;
    }

    public RegA001(){ }
}

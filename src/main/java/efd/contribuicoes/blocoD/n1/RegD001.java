package efd.contribuicoes.blocoD.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegD001 {

    @Getter @Inclui
    private final String reg = "D001";

    @Getter @Inclui
    private String indMov;

    public RegD001(String indMov) {
        this.indMov = indMov;
    }

    public RegD001(){}
}

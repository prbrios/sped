package efd.contribuicoes.blocoC.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegC001 {

    @Getter @Inclui
    private final String reg = "C001";

    @Getter @Inclui
    private String indMov;

    public RegC001(String indMov) {
        this.indMov = indMov;
    }

    public RegC001(){ }
}

package efd.contribuicoes.bloco0.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0001 {

    @Getter @Inclui
    private final String reg = "0001";

    @Getter @Inclui
    private Integer indMov;

    public Reg0001(Integer indMov) {
        this.indMov = indMov;
    }

    public Reg0001(){}
}

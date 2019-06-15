package efd.contribuicoes.bloco1.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg1001 {

    @Getter @Inclui
    private final String reg = "1001";

    @Getter @Inclui
    private String indMov;

    public Reg1001(String indMov) {
        this.indMov = indMov;
    }

    public Reg1001(){ }
}

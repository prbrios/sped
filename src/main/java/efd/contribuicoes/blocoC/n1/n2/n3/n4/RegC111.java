package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegC111 {

    @Getter @Inclui
private final String reg = "C111";

    @Getter @Setter @Inclui
    private String numPro;

    @Getter @Setter @Inclui
    private String indProc;

    public RegC111(String numPro, String indProc) {
        this.numPro = numPro;
        this.indProc = indProc;
    }

    public RegC111(){}
}

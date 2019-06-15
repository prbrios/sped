package efd.contribuicoes.blocoA.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegA111 {

    @Getter @Inclui
    private final String reg = "A111";

    @Getter @Inclui
    private String numProc;

    @Getter @Inclui
    private String indProc;

    public RegA111(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegA111(){}
}

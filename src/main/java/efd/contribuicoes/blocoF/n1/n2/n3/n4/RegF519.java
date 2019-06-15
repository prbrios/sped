package efd.contribuicoes.blocoF.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegF519 {

    @Getter @Inclui
    private final String reg = "F519";

    @Getter @Inclui
    private String numProc;

    @Getter @Inclui
    private String indProc;

    public RegF519(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegF519(){}
}

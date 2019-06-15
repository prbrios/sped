package efd.contribuicoes.blocoF.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegF129 {

    @Getter @Inclui
    private final String reg = "F129";

    @Getter @Inclui
    private String numProc;

    @Getter @Inclui
    private String indproc;

    public RegF129(String numProc, String indproc) {
        this.numProc = numProc;
        this.indproc = indproc;
    }

    public RegF129(){}
}

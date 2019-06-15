package efd.contribuicoes.blocoF.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegF211 {

    @Getter @Inclui
    private final String reg = "F211";

    @Getter @Inclui
    private String numProc;

    @Getter @Inclui
    private String indProc;

    public RegF211(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegF211(){}
}

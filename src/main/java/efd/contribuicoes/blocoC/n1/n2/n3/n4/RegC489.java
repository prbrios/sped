package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegC489 {

    @Getter @Inclui
    private final String reg = "C489";

    @Getter @Inclui
    private String numProc;

    @Getter @Inclui
    private String indProc;

    public RegC489(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegC489(){}

}

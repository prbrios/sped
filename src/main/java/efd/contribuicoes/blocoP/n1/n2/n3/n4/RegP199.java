package efd.contribuicoes.blocoP.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegP199 {

    @Getter @Inclui
private final String reg = "P199";

    @Getter @Setter @Inclui
    private String numProc;

    @Getter @Setter @Inclui
    private String indProc;

    public RegP199(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegP199(){}
}

package efd.contribuicoes.blocoI.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI199 {

    @Getter @Inclui
    private final String reg = "I199";

    @Getter @Inclui
    private String numProc;

    @Getter @Inclui
    private String indProc;

    public RegI199(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegI199(){}
}

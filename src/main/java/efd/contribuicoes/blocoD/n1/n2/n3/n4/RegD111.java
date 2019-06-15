package efd.contribuicoes.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegD111 {

    @Getter @Inclui
    private final String reg = "D111";

    @Getter @Inclui
    private String numProc;

    @Getter @Inclui
    private String indProc;

    public RegD111(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegD111(){}
}

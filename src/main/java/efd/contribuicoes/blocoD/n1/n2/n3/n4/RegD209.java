package efd.contribuicoes.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegD209 {

    @Getter @Inclui
    private final String reg = "D209";

    @Getter @Inclui
    private String numProc;

    @Getter @Inclui
    private String indProc;

    public RegD209(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegD209(){ }
}

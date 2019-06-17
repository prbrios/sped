package efd.contribuicoes.blocoF.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegF559 {

    @Getter @Inclui
private final String reg = "F559";

    @Getter @Setter @Inclui
    private String codProc;

    @Getter @Setter @Inclui
    private String indProc;

    public RegF559(String codProc, String indProc) {
        this.codProc = codProc;
        this.indProc = indProc;
    }

    public RegF559(){ }
}

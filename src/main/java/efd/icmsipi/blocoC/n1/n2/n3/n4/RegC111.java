package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegC111 {

    @Getter @Inclui
    private final String reg = "C111";

    @Getter @Setter @Inclui
    private String numProc;

    @Getter @Setter @Inclui
    private String indProc;

    public RegC111(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegC111(){}
}

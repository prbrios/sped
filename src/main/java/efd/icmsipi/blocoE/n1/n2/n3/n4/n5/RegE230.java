package efd.icmsipi.blocoE.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegE230 {

    @Getter @Inclui
    private final String reg = "E230";

    @Getter @Setter @Inclui
    private String numDa;

    @Getter @Setter @Inclui
    private String numProc;

    @Getter @Setter @Inclui
    private Integer indProc;

    @Getter @Setter @Inclui
    private String proc;

    @Getter @Setter @Inclui
    private String txtCompl;

    public RegE230(String numDa, String numProc, Integer indProc, String proc, String txtCompl) {
        this.numDa = numDa;
        this.numProc = numProc;
        this.indProc = indProc;
        this.proc = proc;
        this.txtCompl = txtCompl;
    }

    public RegE230(){}
}
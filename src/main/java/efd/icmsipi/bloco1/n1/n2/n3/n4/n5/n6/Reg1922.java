package efd.icmsipi.bloco1.n1.n2.n3.n4.n5.n6;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg1922 {

    @Inclui
    private final String reg = "1922";

    @Inclui
    private String numDa;

    @Inclui
    private String numProc;

    @Inclui
    private String indProc;

    @Inclui
    private String proc;

    @Inclui
    private String txtCompl;

    public Reg1922(String numDa, String numProc, String indProc, String proc, String txtCompl) {
        this.numDa = numDa;
        this.numProc = numProc;
        this.indProc = indProc;
        this.proc = proc;
        this.txtCompl = txtCompl;
    }

    public Reg1922(){}
}
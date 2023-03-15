package efd.icmsipi.bloco1.n1.n2.n3.n4.n5.n6;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg1922 implements Serializable {
	private static final long serialVersionUID = -7425120055903762660L;

	@Getter @Inclui
    private final String reg = "1922";

    @Getter @Setter @Inclui
    private String numDa;

    @Getter @Setter @Inclui
    private String numProc;

    @Getter @Setter @Inclui
    private String indProc;

    @Getter @Setter @Inclui
    private String proc;

    @Getter @Setter @Inclui
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
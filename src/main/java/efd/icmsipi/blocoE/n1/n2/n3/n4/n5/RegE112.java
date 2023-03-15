package efd.icmsipi.blocoE.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;




public class RegE112 implements Serializable {
	private static final long serialVersionUID = -4243680586406814971L;

	@Getter @Inclui
    private final String reg = "E112";

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

    public RegE112(String numDa, String numProc, String indProc, String proc, String txtCompl) {
        this.numDa = numDa;
        this.numProc = numProc;
        this.indProc = indProc;
        this.proc = proc;
        this.txtCompl = txtCompl;
    }

    public RegE112(){}
}
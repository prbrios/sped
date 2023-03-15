package efd.icmsipi.blocoE.n1.n2.n3.n4.n5;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegE312 implements Serializable {
	private static final long serialVersionUID = -3038835280151211883L;

	@Getter @Inclui
    private final String reg = "E312";

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

    public RegE312(String numDa, String numProc, Integer indProc, String proc, String txtCompl) {
        this.numDa = numDa;
        this.numProc = numProc;
        this.indProc = indProc;
        this.proc = proc;
        this.txtCompl = txtCompl;
    }

    public RegE312(){}
}
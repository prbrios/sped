package efd.contribuicoes.blocoF.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegF129 implements Serializable {
	private static final long serialVersionUID = -3412460533323227533L;

	@Getter @Inclui
	private final String reg = "F129";

    @Getter @Setter @Inclui
    private String numProc;

    @Getter @Setter @Inclui
    private String indproc;

    public RegF129(String numProc, String indproc) {
        this.numProc = numProc;
        this.indproc = indproc;
    }

    public RegF129(){}
}

package efd.contribuicoes.blocoP.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegP199 implements Serializable {
	private static final long serialVersionUID = -7462979354333127112L;

	@Getter @Inclui
	private final String reg = "P199";

    @Getter @Setter @Inclui
    private String numProc;

    @Getter @Setter @Inclui
    private String indProc;

    public RegP199(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegP199(){}
}

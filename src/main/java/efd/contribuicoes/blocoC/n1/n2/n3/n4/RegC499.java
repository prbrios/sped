package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegC499 implements Serializable {
	private static final long serialVersionUID = 1533497287613812649L;

	@Getter @Inclui
	private final String reg = "C499";

    @Getter @Setter @Inclui
    private String numProc;

    @Getter @Setter @Inclui
    private String indProc;

    public RegC499(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegC499(){}
}

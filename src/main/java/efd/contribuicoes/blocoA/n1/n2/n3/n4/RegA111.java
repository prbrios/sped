package efd.contribuicoes.blocoA.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegA111 implements Serializable {
	private static final long serialVersionUID = 3116332366250022833L;

	@Getter @Inclui
	private final String reg = "A111";

    @Getter @Setter @Inclui
    private String numProc;

    @Getter @Setter @Inclui
    private String indProc;

    public RegA111(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegA111(){}
}

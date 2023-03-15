package efd.contribuicoes.blocoI.n1.n2.n3.n4.n5;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI299 implements Serializable {
	private static final long serialVersionUID = -3953045397112344456L;

	@Getter @Inclui
    private final String reg = "I299";

    @Getter @Setter @Inclui
    private String numProc;

    @Getter @Setter @Inclui
    private String indProc;

    public RegI299(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegI299(){}
}

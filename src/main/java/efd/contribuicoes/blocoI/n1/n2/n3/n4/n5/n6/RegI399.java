package efd.contribuicoes.blocoI.n1.n2.n3.n4.n5.n6;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI399 implements Serializable {
	private static final long serialVersionUID = -3530322411828160404L;

	@Getter @Inclui
	private final String reg = "I399";

    @Getter @Setter @Inclui
    private String numProc;

    @Getter @Setter @Inclui
    private String indProc;

    public RegI399(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegI399(){}
}

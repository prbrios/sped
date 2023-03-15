package efd.contribuicoes.blocoI.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI199 implements Serializable {
	private static final long serialVersionUID = -4795936759181605379L;

	@Getter @Inclui
	private final String reg = "I199";

    @Getter @Setter @Inclui
    private String numProc;

    @Getter @Setter @Inclui
    private String indProc;

    public RegI199(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public RegI199(){}
}

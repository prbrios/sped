package efd.contribuicoes.bloco1.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg1809 implements Serializable {
	private static final long serialVersionUID = -1716485693254997488L;

	@Getter @Inclui
	private final String reg = "1809";

    @Getter @Setter @Inclui
    private String numProc;

    @Getter @Setter @Inclui
    private String indProc;

    public Reg1809(String numProc, String indProc) {
        this.numProc = numProc;
        this.indProc = indProc;
    }

    public Reg1809(){ }
}

package efd.contribuicoes.blocoF.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegF559 implements Serializable {
	private static final long serialVersionUID = 8518688920552422771L;

	@Getter @Inclui
	private final String reg = "F559";

    @Getter @Setter @Inclui
    private String codProc;

    @Getter @Setter @Inclui
    private String indProc;

    public RegF559(String codProc, String indProc) {
        this.codProc = codProc;
        this.indProc = indProc;
    }

    public RegF559(){ }
}

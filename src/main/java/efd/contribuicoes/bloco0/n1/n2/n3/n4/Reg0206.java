package efd.contribuicoes.bloco0.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0206 implements Serializable {
	private static final long serialVersionUID = -413284753753688470L;

	@Getter @Inclui
private final String reg = "0206";

    @Getter @Setter @Inclui
    private String codComb;

    public Reg0206(String codComb) {
        this.codComb = codComb;
    }

    public Reg0206(){}
}

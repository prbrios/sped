package efd.contribuicoes.bloco1.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg1990 implements Serializable {
	private static final long serialVersionUID = -3125801279428614262L;

	@Getter @Inclui
	private final String reg = "1990";

    @Getter @Setter @Inclui
    private Integer qtdLin1;

    public Reg1990(Integer qtdLin1) {
        this.qtdLin1 = qtdLin1;
    }

    public Reg1990(){ }
}

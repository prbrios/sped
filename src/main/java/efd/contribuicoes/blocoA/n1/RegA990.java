package efd.contribuicoes.blocoA.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegA990 implements Serializable {
	private static final long serialVersionUID = 8379582393098418376L;

	@Getter @Inclui
	private final String reg = "A990";

    @Getter @Setter @Inclui
    private Integer qtdLinA;

    public RegA990(Integer qtdLinA) {
        this.qtdLinA = qtdLinA;
    }

    public RegA990(){ }
}

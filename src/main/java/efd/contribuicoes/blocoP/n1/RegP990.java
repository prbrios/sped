package efd.contribuicoes.blocoP.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegP990 implements Serializable {
	private static final long serialVersionUID = 5770929494801424209L;

	@Getter @Inclui
	private final String reg = "P990";

    @Getter @Setter @Inclui
    private Integer qtdLinP;

    public RegP990(Integer qtdLinP) {
        this.qtdLinP = qtdLinP;
    }

    public RegP990(){}
}

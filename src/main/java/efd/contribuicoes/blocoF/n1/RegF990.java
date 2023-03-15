package efd.contribuicoes.blocoF.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegF990 implements Serializable {
	private static final long serialVersionUID = 3717448237130392298L;

	@Getter @Inclui
	private final String reg = "F990";

    @Getter @Setter @Inclui
    private Integer qtdLinF;

    public RegF990(Integer qtdLinF) {
        this.qtdLinF = qtdLinF;
    }

    public RegF990(){}
}

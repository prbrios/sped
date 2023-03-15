package efd.contribuicoes.blocoM.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegM990 implements Serializable {
	private static final long serialVersionUID = 3477043355053762104L;

	@Getter @Inclui
    private final String reg = "M990";

    @Getter @Setter @Inclui
    private Integer qtdLinM;

    public RegM990(Integer qtdLinM) {
        this.qtdLinM = qtdLinM;
    }

    public RegM990(){}
}

package efd.contribuicoes.blocoI.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI990 implements Serializable {
	private static final long serialVersionUID = 6296626116212521111L;

	@Getter @Inclui
	private final String reg = "I990";

    @Getter @Setter @Inclui
    private Integer qtdLinI;

    public RegI990(Integer qtdLinI) {
        this.qtdLinI = qtdLinI;
    }

    public RegI990(){}
}

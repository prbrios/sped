package efd.contribuicoes.blocoD.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegD990 implements Serializable {
	private static final long serialVersionUID = 3643664653031451364L;

	@Getter @Inclui
	private final String reg = "D990";

    @Getter @Setter @Inclui
    private Integer qtdLinD;


    public RegD990(Integer qtdLinD) {
        this.qtdLinD = qtdLinD;
    }

    public RegD990(){}
}

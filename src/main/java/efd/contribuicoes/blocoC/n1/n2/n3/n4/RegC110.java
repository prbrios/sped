package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegC110 implements Serializable {
	private static final long serialVersionUID = 8234729817162666043L;

	@Getter @Inclui
	private final String reg = "C110";

    @Getter @Setter @Inclui
    private String codInf;

    @Getter @Setter @Inclui
    private String txtCompl;

    public RegC110(String codInf, String txtCompl) {
        this.codInf = codInf;
        this.txtCompl = txtCompl;
    }

    public RegC110(){}
}

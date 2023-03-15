package efd.contribuicoes.blocoA.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegA110 implements Serializable {
	private static final long serialVersionUID = -8852339394470025268L;

	@Getter @Inclui
	private final String reg = "A110";

    @Getter @Setter @Inclui
    private String codInf;

    @Getter @Setter @Inclui
    private String txtCompl;

    public RegA110(String codInf, String txtCompl) {
        this.codInf = codInf;
        this.txtCompl = txtCompl;
    }

    public RegA110(){ }
}

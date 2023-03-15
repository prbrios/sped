package efd.contribuicoes.blocoA.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoA.n1.n2.RegA010;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

public class RegA001 implements Serializable {
	private static final long serialVersionUID = 9109970408434947974L;

	@Getter @Inclui
	private final String reg = "A001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<RegA010> regA010;

    public RegA001(String indMov) {
        this.indMov = indMov;
    }

    public RegA001(){ }
}

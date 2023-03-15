package efd.contribuicoes.blocoI.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;

import efd.contribuicoes.blocoI.n1.n2.RegI010;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

public class RegI001 implements Serializable {
	private static final long serialVersionUID = -1906825789252151507L;

	@Getter @Inclui
	private final String reg = "I001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<RegI010> regI010;

    public RegI001(String indMov) {
        this.indMov = indMov;
    }

    public RegI001(){}
}

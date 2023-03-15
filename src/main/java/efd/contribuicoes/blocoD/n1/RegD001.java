package efd.contribuicoes.blocoD.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoD.n1.n2.RegD010;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

public class RegD001 implements Serializable {
	private static final long serialVersionUID = 3142343053736613687L;

	@Getter @Inclui
	private final String reg = "D001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<RegD010> regD010;

    public RegD001(String indMov) {
        this.indMov = indMov;
    }

    public RegD001(){}
}

package efd.contribuicoes.blocoP.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoP.n1.n2.RegP010;
import efd.contribuicoes.blocoP.n1.n2.RegP200;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

public class RegP001 implements Serializable {
	private static final long serialVersionUID = -9194037600315582888L;

	@Getter @Inclui
	private final String reg = "P001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<RegP010> regP010;

    @Getter @Setter @Filho
    private List<RegP200> regP200;

    public RegP001(String indMov) {
        this.indMov = indMov;
    }

    public RegP001(){}
}

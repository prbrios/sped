package efd.contribuicoes.blocoC.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.RegC010;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

public class RegC001 implements Serializable {
	private static final long serialVersionUID = 8377384511232656741L;

	@Getter @Inclui
	private final String reg = "C001";

    @Getter @Setter @Inclui
    private String indMov;

    @Getter @Setter @Filho
    private List<RegC010> regC010;

    public RegC001(String indMov) {
        this.indMov = indMov;
    }

    public RegC001(){ }
}

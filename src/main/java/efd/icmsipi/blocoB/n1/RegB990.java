package efd.icmsipi.blocoB.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegB990 implements Serializable {
	private static final long serialVersionUID = 5768048010076714442L;

	@Getter @Inclui
    private final String reg = "B990";

    @Getter @Setter @Inclui
    private Integer qtdLinB;

    public RegB990(Integer qtdLinB) {
        this.qtdLinB = qtdLinB;
    }

    public RegB990(){}
}

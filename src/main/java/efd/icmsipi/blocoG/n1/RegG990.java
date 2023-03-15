package efd.icmsipi.blocoG.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegG990 implements Serializable {
	private static final long serialVersionUID = 4777928991690769950L;

	@Getter @Inclui
    private final String reg = "G990";

    @Getter @Setter @Inclui
    private Integer qtdLinG;

    public RegG990(Integer qtdLinG) {
        this.qtdLinG = qtdLinG;
    }

    public RegG990(){}
}
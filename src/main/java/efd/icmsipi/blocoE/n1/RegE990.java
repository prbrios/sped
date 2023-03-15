package efd.icmsipi.blocoE.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegE990 implements Serializable {
	private static final long serialVersionUID = 3521234745114709229L;

	@Getter @Inclui
    private final String reg = "E990";

    @Getter @Setter @Inclui
    private Integer qtdLinE;

    public RegE990(Integer qtdLinE) {
        this.qtdLinE = qtdLinE;
    }

    public RegE990(){}
}
package efd.icmsipi.blocoK.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegK990 implements Serializable {
	private static final long serialVersionUID = -7421802275088476466L;

	@Getter @Inclui
    private final String reg = "K990";

    @Getter @Setter @Inclui
    private Integer qtdLinK;

    public RegK990(Integer qtdLinK) {
        this.qtdLinK = qtdLinK;
    }

    public RegK990(){}
}
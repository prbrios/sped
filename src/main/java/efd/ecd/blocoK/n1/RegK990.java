package efd.ecd.blocoK.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegK990 implements Serializable {
	private static final long serialVersionUID = -3534852196826148127L;

	@Getter @Inclui
    private final String reg = "K990";

    @Getter @Setter @Inclui
    private Integer qtdLinK;

    public RegK990() {}

    public RegK990(Integer qtdLinK) {
        this.qtdLinK = qtdLinK;
    }

}

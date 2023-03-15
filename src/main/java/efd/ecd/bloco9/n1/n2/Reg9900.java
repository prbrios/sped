package efd.ecd.bloco9.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg9900 implements Serializable {
	private static final long serialVersionUID = -5725748891247671938L;

	@Getter @Inclui
	public final String reg = "9900";

    @Getter @Setter @Inclui
    private String regBlc;

    @Getter @Setter @Inclui
    private Integer qtdRegBlc;

    public Reg9900(){}

    public Reg9900(String regBlc, Integer qtdRegBlc) {
        this.regBlc = regBlc;
        this.qtdRegBlc = qtdRegBlc;
    }

}

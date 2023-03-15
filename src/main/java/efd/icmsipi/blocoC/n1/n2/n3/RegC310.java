package efd.icmsipi.blocoC.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegC310 implements Serializable {
	private static final long serialVersionUID = -7274657628974914253L;

	@Getter @Inclui
    private final String reg = "C310";

    @Getter @Setter @Inclui
    private Integer numDocCanc;

    public RegC310(Integer numDocCanc) {
        this.numDocCanc = numDocCanc;
    }

    public RegC310(){}
}

package efd.icmsipi.blocoD.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegD411 implements Serializable {
	private static final long serialVersionUID = -46625418592469486L;

	@Getter @Inclui
    private final String reg = "D411";

    @Getter @Setter @Inclui
    private Long numDocCanc;

    public RegD411(Long numDocCanc) {
        this.numDocCanc = numDocCanc;
    }

    public RegD411(){}
}
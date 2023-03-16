package efd.icmsipi.blocoC.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegC601 implements Serializable {
	private static final long serialVersionUID = 6360294112237107063L;

	@Getter @Inclui
    private final String reg = "C601";

    @Getter @Setter @Inclui
    private Long numDocCanc;

    public RegC601(Long numDocCanc) {
        this.numDocCanc = numDocCanc;
    }

    public RegC601(){}
}
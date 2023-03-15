package efd.icmsipi.blocoC.n1.n2.n3.n4.n5;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegC465 implements Serializable {
	private static final long serialVersionUID = 3420720128180562247L;

	@Getter @Inclui
    private final String reg = "C465";

    @Getter @Setter @Inclui
    private String chvCfe;

    @Getter @Setter @Inclui
    private Integer numCcf;

    public RegC465(String chvCfe, Integer numCcf) {
        this.chvCfe = chvCfe;
        this.numCcf = numCcf;
    }

    public RegC465(){}
}
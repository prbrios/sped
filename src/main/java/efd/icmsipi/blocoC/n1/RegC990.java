package efd.icmsipi.blocoC.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegC990 implements Serializable {
	private static final long serialVersionUID = 5124105560799553629L;

	@Getter @Inclui
    private final String reg = "C990";

    @Getter @Setter @Inclui
    private Integer qtdLinC;

    public RegC990(Integer qtdLinC) {
        this.qtdLinC = qtdLinC;
    }

    public RegC990(){}
}
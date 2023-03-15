package efd.icmsipi.bloco0.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg0990 implements Serializable {
	private static final long serialVersionUID = 551096352262348707L;

	@Getter @Inclui
    private final String reg = "0990";

    @Getter @Setter @Inclui
    private Integer qtdLin0;

    public Reg0990(Integer qtdLin0) {
        this.qtdLin0 = qtdLin0;
    }

    public Reg0990(){}

}

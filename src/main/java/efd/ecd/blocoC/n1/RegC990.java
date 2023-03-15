package efd.ecd.blocoC.n1;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegC990 implements Serializable {
	private static final long serialVersionUID = 6111131976646086940L;

	@Getter @Inclui
    private final String reg = "C990";

    @Getter @Setter @Inclui
    private Integer qtdLin0;

    public RegC990(Integer qtdLin0) {
        this.qtdLin0 = qtdLin0;
    }

    public RegC990(){}
    
}

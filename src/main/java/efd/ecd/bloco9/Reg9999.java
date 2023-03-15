package efd.ecd.bloco9;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg9999 implements Serializable {
	private static final long serialVersionUID = 2153684008740357390L;

	@Getter @Inclui
	private final String reg = "9999";

    @Getter @Setter @Inclui
    private Integer qtdLin;

    public Reg9999(){}
    
    public Reg9999(Integer qtdLin) {
        this.qtdLin = qtdLin;
    }
    
}

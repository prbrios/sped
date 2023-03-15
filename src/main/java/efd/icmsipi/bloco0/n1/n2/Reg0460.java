package efd.icmsipi.bloco0.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg0460 implements Serializable {
	private static final long serialVersionUID = 2106408951709503523L;

	@Getter @Inclui
    private final String reg = "0460";

    @Getter @Setter @Inclui
    private String codObs;

    @Getter @Setter @Inclui
    private String txt;

    public Reg0460(String codObs, String txt) {
        this.codObs = codObs;
        this.txt = txt;
    }

    public Reg0460(){}
}

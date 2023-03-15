package efd.icmsipi.bloco0.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg0450 implements Serializable {
	private static final long serialVersionUID = 8848760296396520604L;

	@Getter @Inclui
    private final String reg = "0450";

    @Getter @Setter @Inclui
    private String codInf;

    @Getter @Setter @Inclui
    private String txt;

    public Reg0450(String codInf, String txt) {
        this.codInf = codInf;
        this.txt = txt;
    }

    public Reg0450(){}

}
